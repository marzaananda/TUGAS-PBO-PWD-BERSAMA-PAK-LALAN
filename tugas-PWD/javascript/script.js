
const time = new Date();


const namaHari = ["Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"];
const namaBulan = [
  "Januari", "Februari", "Maret", "April", "Mei", "Juni",
  "Juli", "Agustus", "September", "Oktober", "November", "Desember"
];


const tanggal = time.getDate();          
const hari    = namaHari[time.getDay()];  
const bulan   = namaBulan[time.getMonth()]; 
const tahun   = time.getFullYear();      


console.log(time.toString());
console.log("Hari ini adalah tanggal : " + tanggal);
console.log("Hari ini adalah hari : " + hari);
console.log("Hari ini adalah bulan : " + bulan);
console.log("Hari ini adalah tahun : " + tahun);
// output html
document.write(time.toString()+"<br>");
document.write("Hari ini adalah tanggal : " + tanggal+"<br>");
document.write("Hari ini adalah hari : " + hari+"<br>");
document.write("Hari ini adalah bulan : " + bulan+"<br>");
document.write("Hari ini adalah tahun : " + tahun+"<br>");
