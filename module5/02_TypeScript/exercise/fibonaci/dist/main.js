function fibonacci(num) {
    if (num <= 1) {
        return 1;
    }
    return fibonacci(num - 1) + fibonacci(num - 2);
}
let arr = new Array();
let sum = 0;
for (let i = 0; i < 10; i++) {
    arr.push(fibonacci(i));
    sum += fibonacci(i);
}
for (let a = 0; a < arr.length; a++) {
    console.log(arr[a]);
}
console.log("tổng các số fibonacci trong mảng là :" + sum);
//# sourceMappingURL=main.js.map