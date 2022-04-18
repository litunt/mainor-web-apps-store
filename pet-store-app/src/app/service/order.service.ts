import { HttpClient } from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Order} from "../models/order";
import {Observable} from "rxjs";


@Injectable()
export class OrderService {

  private BASE_URL = 'http://localhost:3030/orders';

  constructor(private http: HttpClient) {
  }

  public createOrder(order: Order): Observable<any> {
    return this.http.post(this.BASE_URL, order);
  }
}
