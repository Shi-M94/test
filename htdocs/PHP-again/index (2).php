<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charaset="UTF-8">
    <title>4eachbolg</title>
    <link rel="stylesheet" type="text/css" href="blog_style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

    <script>
    $(document).ready(function(){
      $('.slider').bxSlider({
          auto:true,
          mode:"horizontal",
          speed:2000,
          slideWidth:1100
      });
    });
    </script>
</head>
    <body>
    <img src="4eachblog_logo.jpg">
    <header>
       <ul>
        <li>トップ</li>
        <li>プロフィール</li>
        <li>4eachについて</li>
        <a href="index.php"><li>登録フォーム</li></a>
        <li>問い合わせ</li>
        <li>その他</li>
      </ul>  
    </header>
    
    <main>
        <left>
            <h2>プログラミングに役立つ書籍</h2>
            2017年1月15日
            <br>
            <br>
            <div class="slider">
                <div><img src="jQuery_image1.jpg"></div>
                <div><img src="jQuery_image2.jpg"></div>
                <div><img src="jQuery_image3.jpg"></div>
                <div><img src="jQuery_image4.jpg"></div>
                <div><img src="jQuery_image5.jpg"></div>
            </div>
            4eachはインターノウスが提供するオンラインでプログラミングが勉強できるイーラーニングシステムです<br><br>
            記事中身<br><br>
            
            <div class="box">
                <div class="boxp">
                    <img src="pic1.jpg">
                    <p>ドメイン取得方法</p>
                </div>
                <div class="boxp">
                    <img src="pic2.jpg">
                    <p>快適な職場環境</p>
                </div>
                <div class="boxp">
                    <img src="pic3.jpg">
                    <p>Linuxの基礎</p>
                </div>
                <div class="boxp">
                    <img src="pic4.jpg">
                    <p>マーケティング入門</p>
                </div>
                <div class="boxp">
                    <img src="pic5.jpg">
                    <p>アクティブラーニング</p>
                </div>
                <div class="boxp">
                    <img src="pic6.jpg">
                    <p>CSSの効率的な勉強方法</p>
                </div>
                <div class="boxp">
                    <img src="pic7.jpg">
                    <p>リーダブルコードとは</p>
                </div>
                <div class="boxp">
                    <img src="pic8.jpg">
                    <p>HTMLの可能性</p>
                </div>
            </div>          
        </left>
        
        <right>
            <h3>人気の記事</h3>
                <ul>
                    <li>PHPオススメ</li>
                    <li>PHP MyAdminの使い方</li>
                    <li>今人気のエディタ</li>
                    <li>HTMLの基礎</li>
                </ul>
            <h3>オススメリンク</h3>
                 <ul>
                    <li>インターノウス株式会社</li>
                    <li>XAMPPのダウンロード</li>
                    <li>Eclipseのダウンロード</li>
                    <li>Bracketsのダウンロード</li>
                </ul>
            <h3>カテゴリ</h3>
                 <ul>
                    <li>HTML</li>
                    <li>PHP</li>
                    <li>MySQL</li>
                    <li>JavaScript</li>
                </ul>
        </right>
        
    </main>    
        
    <footer>copyright © internous | 4each blog s the one which provides A to Z about programing.</footer>
    <script type="text/javascript" src="blog_script.js"></script> 
        
    
    
    </body>
</html>