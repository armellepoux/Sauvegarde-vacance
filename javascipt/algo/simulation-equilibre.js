const cardMax = 14; //nombre de cartes au depart
let pot = 0;
let oop = { //joueur 1 oop
    money: 1000
};

let ip ={ //joueur 2 ip
    money: 1000
};

function randomCard(){
    // http://stackoverflow.com/questions/4959975/
    return Math.floor(Math.random() * cardMax) + 1
}


function enter(player){
    player.money = player.money - 1;
    pot = pot + 1;
    player.card = randomCard();
}

function bet(){
    oop.money = oop.money - 1;
    oop.move = "BET";
    pot = pot + 1;
}

function call(){
    ip.money = ip.money - 1;
    ip.move = "CALL";
    pot = pot + 1;
}

function fold(player){
    // it's always ip that fold
    // You don't loose anything by folding
    player.move= "FOLD";
    player.card=-1;
}

function results(){
    // TODO !  if then else

    if (oop.card>ip.card){ //== on convertit des string en int ou autre, ===on ne convertit pas. || signifie ou
        oop.money+=pot; //oop.money=opp.money+pot;
    }
    else{
        ip.money+=pot;
    }

    //console.log(pot, oop, ip);
}



function gameIpVersusSmartManiac(oopBetLimit,ipCallLimit=4){
    pot = 0;
    enter(oop);
    enter(ip);

    // oop doesn't always bet
    if (oop.card>=oopBetLimit){
    bet(oop);
        if (ip.card >= ipCallLimit){
        call();
    }else{
        fold(ip);
        ip.move = "FOLD";
    }
    }
    else{
        fold(oop);
    }
    

    results();
}

function simulation(){
    // we are looking for ip best strategy against a maniac
    let ipResult = [];
    let oopResult = [];
    let altResult = {};


    for (let limit = 2 ; limit <= 14; limit ++){ // let est comme var, on mise tout le temps si on met 2 a 14
        ip.money = 1000;
        oop.money = 1000;
        for (let i = 0 ; i < 10000 ; i++){ // up to 1M //10 est le nombre d'exemples
            gameIpVersusSmartManiac(limit);
        }
        ipResult[limit] = ip.money;
        oopResult[limit] = oop.money;

        altResult[limit+":"]=oop.money;
        // altResult[limit+":"]=ip.money;
    }

    console.log(ipResult);
    console.log(altResult);
}

simulation();

// What is the best call strategy ? Display alt results
// What is a good enough bet strategy ?
// What if ip bet value changes to pot size ? to twice the pot size ?