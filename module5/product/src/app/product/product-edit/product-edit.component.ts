import {Component, OnInit} from '@angular/core';
import {ProductServiceService} from '../../service/product-service.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Product} from '../../model/product';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  id: number;
  product: Product;
  productForm: FormGroup;

  constructor(private productServiceService: ProductServiceService, a: ActivatedRoute) {
    a.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.product = this.productServiceService.findByIdProduct(this.id);
    });
    this.productForm = new FormGroup({
      id: new FormControl(this.product.id, [Validators.required, Validators.pattern(/^[0-9]$/)]),
      name: new FormControl(this.product.name, Validators.required),
      price: new FormControl(this.product.price, Validators.required),
      description: new FormControl(this.product.description, Validators.required)
    });
  }

  ngOnInit(): void {
  }

  edit() {
    this.product = this.productForm.value;
    this.productServiceService.editProduct(this.product.id,this.product);
    console.log(this.product);

  }
}
