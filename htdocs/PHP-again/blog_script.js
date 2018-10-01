jQuery(function(){
    
    $("right ul li").hover(
        function(){
            $(this).css("font-size","+=5");
        },
        function(){
            $(this).css("font-size","-=5");
        });
  
   
   $("header ul li").hover(
        function(){
            $(this).css("background-color","gray");
        },
        function(){
            $(this).css("background-color","black");
        });
    
    $(".boxp img").hover(
        function(){
            $(this).css({width:"+=10"});
        },
        function(){
            $(this).css({width:"-=10"});
        });
    
    
    
    
    
    
});