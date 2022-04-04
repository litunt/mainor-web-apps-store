import {HttpClient, HttpParams} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";


@Injectable()
export class ProductService {

  private BASE_API_URL = 'http://localhost:3030';

  constructor(private http: HttpClient) {
  }

  public getProducts(category: string, petType: string): Observable<any> {
    let params: HttpParams = new HttpParams();
    params = params.append("category", category);
    params = params.append("petType", petType);
    return this.http.get(`${this.BASE_API_URL}/products`, {params: params});
  }
}
