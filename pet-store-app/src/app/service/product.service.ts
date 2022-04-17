import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";


@Injectable()
export class ProductService {

  private BASE_URL = 'http://localhost:3030/products';

  constructor(private http: HttpClient) {
  }

  public getProducts(category: string, petType?: string): Observable<any> {
    let params: HttpParams = new HttpParams();
    params = params.append("category", category);
    if (petType) {
      params = params.append("petType", petType);
    }
    return this.http.get(`${this.BASE_URL}`, {params: params});
  }
}
