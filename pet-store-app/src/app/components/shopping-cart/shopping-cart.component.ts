import { Component, OnInit } from '@angular/core';
import {CartItem} from "../../models/cartItem";
import {CartService} from "../../service/cart.service";
import {Product} from "../../models/product";
import {OrderService} from "../../service/order.service";
import {Order} from "../../models/order";
import { Router } from '@angular/router';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  public cartItems: CartItem[] = [];
  userEmail: string = '';
  displayedColumns: string[] = ['name', 'petType', 'category', 'price', 'amount'];

  constructor(private cartService: CartService,
              private orderService: OrderService,
              private router: Router) { }

  ngOnInit(): void {
    this.cartItems = this.cartService.getCartFromStorage();
  }

  changeProductAmount(e: any, product: Product): void {
    const amount = e.target.value;
    this.cartService.updateProductAmount(product.id, amount);
  }

  changeUserEmail(e: any): void {
    this.userEmail = e.target.value;
  }

  placeOrder(): void {
    const updatedCartItems = this.cartService.getCartFromStorage();
    let order = {
      id: '',
      createdAt: new Date(),
      userEmail: this.userEmail,
      orderItems: updatedCartItems
    };
    this.orderService.createOrder(order).subscribe((newOrder: Order) => {
      localStorage.clear();
      console.log(newOrder);
      this.router.navigate(['order-complete']);
    });
  }
}
