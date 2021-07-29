import { Component, OnInit } from '@angular/core';
import {ProductServiceService} from '../../service/product-service.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  listProduct : Product[];
  constructor(private productService : ProductServiceService) {
    this.listProduct =  productService.findAll();
  }

  ngOnInit(): void {
  }

  delete(id: number) {
    this.productService.deleteProduct(id);
  }
}
