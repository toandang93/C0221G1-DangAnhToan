function tinh() {
    let so1 = parseFloat(document.getElementById("num1").value);
    let so2 = parseFloat(document.getElementById("num2").value);
    let so3 = so1*so2*2.56;
    document.getElementById("result").innerText = chuanHoaDuLieu(so3);


}

function chuanHoaDuLieu(a) {
    let b = a.toString();
    let cham = b.indexOf(".");
    let cent = b.substring(cham + 1, cham + 3);
    let hunder = b.substring(cham - 3,cham);
    let thousand = b.substring(cham - 6, cham -3);
    let ketQua = thousand + "," + hunder + "." + cent;
    return "Kết quả là :"+ketQua;
}

