import {Injectable} from "@angular/core";
import {Product} from "../models/product";
import {CartItem} from "../models/cartItem";

@Injectable()
export class CartService {
  private LOCALSTORAGE_CART_KEY = 'cart';

  constructor() {
  }

  public addProductToCart(product: Product) {
    const cartItemsAsStr = localStorage.getItem(this.LOCALSTORAGE_CART_KEY);
    let cartItems: CartItem[] = [];
    let amount = 1;
    if (cartItemsAsStr !== null) {
      cartItems = <CartItem[]> JSON.parse(cartItemsAsStr);
      if (this.cartContainsProduct(product, cartItems)) {
        amount += 1;
      }
    }
    let cartItem = {
      product,
      amount
    };
    cartItems.push(cartItem);
    localStorage.setItem(this.LOCALSTORAGE_CART_KEY, JSON.stringify(cartItems));
  }

  public updateProductAmount(productId: number, amount: number) {
    const cartItemsAsStr = localStorage.getItem(this.LOCALSTORAGE_CART_KEY);
    if (cartItemsAsStr === null) {
      return;
    }
    let cartItems = <CartItem[]> JSON.parse(cartItemsAsStr);
    cartItems.forEach(item => {
      if (item.product.id === productId) {
        item.amount = amount;
      }
    });
    localStorage.setItem(this.LOCALSTORAGE_CART_KEY, JSON.stringify(cartItems));
  }

  public getCartFromStorage(): CartItem[] {
    const cartItemsAsStr = localStorage.getItem(this.LOCALSTORAGE_CART_KEY);
    if (cartItemsAsStr !== null) {
      return <CartItem[]> JSON.parse(cartItemsAsStr);
    }
    return [];
  }

  private cartContainsProduct(product: Product, cartItems: CartItem[]): boolean {
    return cartItems.some(item => item.product.id === product.id);
  }
}
