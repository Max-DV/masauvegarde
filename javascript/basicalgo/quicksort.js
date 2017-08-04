const inputs= [2,5,6,3,0,-12,34];// on peut définir une constante on peut pas le redéfinir derriere

function quickSort (array){

    if (array.length==0){
        return [];
    }
    const smalls = [], bigs = [];
    const first = array[0]; // si j'ai pas de first probleme, first est un pivot

    for(var i= 1; i< array.length ; i++){
        var current = array[i]; // eviter d'avoir array.i en plein milieu

        if(current<first){
            smalls.push(current);// different de concat,avec push on garde le tableau current
        }else{
            bigs.push(current);
        }
    }

    return quickSort(smalls).concat(first).concat( quickSort(bigs)); // concatene les tableaux, peut peut etre rajouter des valeurs...
}
console.log(quickSort(inputs));