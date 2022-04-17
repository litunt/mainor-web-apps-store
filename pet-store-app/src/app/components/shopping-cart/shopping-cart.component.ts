import { Component, OnInit } from '@angular/core';
import {CartItem} from "../../models/cartItem";
import {CartService} from "../../service/cart.service";
import {Product} from "../../models/product";

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {

  public cartItems: CartItem[] = [];
  displayedColumns: string[] = ['name', 'petType', 'category', 'price', 'amount'];

  constructor(private cartService: CartService) { }

  ngOnInit(): void {
    this.cartItems = this.cartService.getCartFromStorage();
  }

  changeProductAmount(e: any, product: Product) {
    const amount = e.target.value;
    this.cartService.updateProductAmount(product.id, amount);
  }

}
