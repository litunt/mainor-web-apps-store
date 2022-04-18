import {CartItem} from "./cartItem";

export interface Order {
  id: any,
  createdAt: Date,
  userEmail: string,
  orderItems: CartItem[]
}
