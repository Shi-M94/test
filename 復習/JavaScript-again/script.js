function menseki(hankei){
    return hankei*hankei*3.14;
}

document.write(menseki(5)+"<br>");
document.write(menseki(7)+"<br>");
document.write(menseki(10)+"<br>");
document.write("<br>");

function price(group,otona,kodomo){
    return group+"グループの合計金額は"+(500*otona+200*kodomo)+"円です<br>";
}

document.write(price("A",2,4));
document.write(price("B",1,5));
document.write(price("C",3,7));

document.write("<br>");
document.write("<br>");

var a=0;
while(a<5){
      document.write("★");
      a++;
      }
document.write("<br>");
document.write("<br>");

for(b=0;b<2;b++){
    for(c=0;c<3;c++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>");

for(d=0;d<2;d++){
    for(e=0;e<5;e++){
        document.write("☆");
    }
    document.write("<br>");
}
document.write("<br>");

for(f=0;f<4;f++){
    for(g=0;g<5;g++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>");

for(h=0;h<4;h++){
    for(i=0;i<3;i++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>");

for(j=1;j<=3;j++){
    for(k=1;k<=3;k++){
    if(k%2==0){
       document.write("☆");
       }else{
        document.write("★");}
    }
    document.write("<br>");
}
document.write("<br>");

for(l=0;l<4;l++){
    for(m=1;m<=5;m++){
        if(m%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}
document.write("<br>");

for(n=1;n<=5;n++){
    for(o=0;o<n;o++){
        document.write("★");
    }
    document.write("<br>");
}









