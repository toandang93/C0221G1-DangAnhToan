import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.scss']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup = new FormGroup({
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });
  category1: Category;
  categories: Category[] = [];

  constructor(private productService: ProductService,
              private categoryService: CategoryService) {
  }

  ngOnInit() {
    this.getAllCategory();
  }

  submit() {
    this.categoryService.findById(this.productForm.get('category').value).subscribe(category => {
      this.category1 = category;
      console.log(this.category1);
      const product = this.productForm.value;
      product.category = this.category1;
      this.productService.saveProduct(product).subscribe(() => {
        alert('Thêm thành công');
      });
    });
  }

  getAllCategory() {
    this.categoryService.getAll().subscribe(categoires => {
      this.categories = categoires;
    });
  }
}
