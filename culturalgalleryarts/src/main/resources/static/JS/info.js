let hamburgerWrap = document.querySelector(".hamburger-wrap");
let nav = document.querySelector(".navigation");
let burger = document.querySelectorAll(".hamburger");

window.onload = () => {
    document.body.addEventListener('mousemove', myFunction);
    hamburgerWrap.addEventListener('click', addingOpen);

}

function addingOpen() {
    nav.classList.toggle("open");
    for (var i = 0; i < burger.length; i++) {
        burger[i].classList.toggle("open");
    }
}

//why not working grrr!!!
function myFunction() {
    var w = window.innerWidth;
    var h = window.outerHeight;
    if(w > 450){
        nav.classList.remove("open");
    }
}


