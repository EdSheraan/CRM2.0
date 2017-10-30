/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $(window).trigger('scroll');
    $(window).scroll(function (event) {
        var scroll = $(window).scrollTop();
        var grupo = $('#grupo').position();
        var ministerio = $('#ministerio').position();
        var pm = $('#pm').position();
        var escuela = $('#escuela').position();
        var footer = $('#footer').position();
        var k = 64;
        if (between(0, grupo.top - k, scroll)) {
            $('.navbar-color').addClass('blue-grey darken-3');
            $('.navbar-color').removeClass('green accent-4');

            $('.btn-login').removeClass('green accent-3');
            $('.btn-login').addClass('blue');
        }
        if (between(grupo.top - k, ministerio.top - k, scroll)) {
            $('.navbar-color').removeClass('blue-grey darken-3');
            $('.navbar-color').addClass('green accent-4');

            $('.btn-login').removeClass('blue');
            $('.btn-login').addClass('green accent-3');
        }
        if (between(ministerio.top - k, pm.top - k, scroll)) {
            $('.navbar-color').removeClass('green accent-4');
            $('.navbar-color').removeClass('blue');
            $('.navbar-color').addClass('red');

            $('.btn-login').removeClass('green accent-3');
            $('.btn-login').removeClass('blue lighten-2');
            $('.btn-login').addClass('red lighten-2');
        }
        if (between(pm.top - k, escuela.top - k, scroll)) {
            $('.navbar-color').removeClass('red yellow darken-1');
            $('.navbar-color').addClass('blue');

            $('.btn-login').removeClass('red lighten-2 yellow lighten-2');
            $('.btn-login').addClass('blue lighten-2');
        }
        if (between(escuela.top - k, footer.top - k, scroll)) {
            $('.navbar-color').removeClass('blue');
            $('.navbar-color').addClass('yellow darken-1');

            $('.btn-login').removeClass('blue lighten-2');
            $('.btn-login').addClass('yellow lighten-2');
        }
    });

    var hashTagActive = "";
    $(".scroll").on("click touchstart", function (event) {
        if (hashTagActive != this.hash) { 
            event.preventDefault();
            //calculate destination place
            var dest = 0;
            if ($(this.hash).offset().top > $(document).height() - $(window).height()) {
                dest = $(document).height() - $(window).height();
            } else {
                dest = $(this.hash).offset().top;
            }
            //go to destination
            $('html,body').animate({
                scrollTop: dest
            }, 300, 'swing');
            hashTagActive = this.hash;
        }
    });
});




