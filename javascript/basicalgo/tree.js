const root = {
    value: 'html',
    children: ['head',
        {
            value: 'body',
            children: [
                { value: 'div', children: [] },
                { value: 'p', children: [] }
            ]


        }] // corresponds au roots
}

function displayNode(root){
    console.log('node value', root.value);
    displayChildren (root.children);
}

function displayChildren(children) {
    children.forEach( function(child){
         if (typeof child=== 'string'){
             console.log('leaf', child);
         }  else{
             displayNode(child);
         }

    });
}
displayNode (root);


/* pour afficher toutes les values petit a petit, je fais une fonction displayRoot
Je fais console.log pour la value, et pour displayChildren
J'ecris ensuite une fonction displayChildren
J'ecris une liste de chose a faire pour chaque children (forEach). Pour chaque élement je vais mettre une fonction qui 
dépend du children. Pour chaque enfant je vais faire qqch avec un enfant
Je fais une condition if les children sont un tableau, 
La boucle va permettre de s'autoreferencer jusqu'a ce que ca tombe sur une feuille*/