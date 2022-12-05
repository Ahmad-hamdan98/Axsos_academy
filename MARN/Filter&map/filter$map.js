const pokémon = Object.freeze([
        { "id": 1,   "name": "Bulbasaur",  "types": ["poison", "grass"] },
        { "id": 5,   "name": "Charmeleon", "types": ["fire"] },
        { "id": 9,   "name": "Blastoise",  "types": ["water"] },
        { "id": 12,  "name": "Butterfree", "types": ["bug", "flying"] },
        { "id": 16,  "name": "Pidgey",     "types": ["normal", "flying"] },
        { "id": 23,  "name": "Ekans",      "types": ["poison"] },
        { "id": 24,  "name": "Arbok",      "types": ["poison"] },
        { "id": 25,  "name": "Pikachu",    "types": ["electric"] },
        { "id": 37,  "name": "Vulpix",     "types": ["fire"] },
        { "id": 52,  "name": "Meowth",     "types": ["normal"] },
        { "id": 63,  "name": "Abra",       "types": ["psychic"] },
        { "id": 67,  "name": "Machamp",    "types": ["fighting"] },
        { "id": 72,  "name": "Tentacool",  "types": ["water", "poison"] },
        { "id": 74,  "name": "Geodude",    "types": ["rock", "ground"] },
        { "id": 87,  "name": "Dewgong",    "types": ["water", "ice"] },
        { "id": 98,  "name": "Krabby",     "types": ["water"] },
        { "id": 115, "name": "Kangaskhan", "types": ["normal"] },
        { "id": 122, "name": "Mr. Mime",   "types": ["psychic"] },
        { "id": 133, "name": "Eevee",      "types": ["normal"] },
        { "id": 144, "name": "Articuno",   "types": ["ice", "flying"] },
        { "id": 145, "name": "Zapdos",     "types": ["electric", "flying"] },
        { "id": 146, "name": "Moltres",    "types": ["fire", "flying"] },
        { "id": 148, "name": "Dragonair",  "types": ["dragon"] }
    ]);
    
    const bListPkmn = pokémon.filter( p => p.name[0] === "B" );
    const bListPkmn1 = pokémon.filter( p => p.id%3==0);

    // for (i=0;i<bListPkmn1.length;i+=1){
    //     console.log("First ",bListPkmn1[i].name);

    // }
    console.log("First ",bListPkmn1);
    const bListPkmn2 = pokémon.filter( p => p.types.includes("fire"));
    console.log("Secound ",bListPkmn2);
    const bListPkmn3 = pokémon.filter( p => p.types.length>1);
    console.log("Third ",bListPkmn3);
    const bListPkmn4 = pokémon.map( p=> p.name);
    console.log("Fourth ",bListPkmn4);
    const bListPkmn5   = pokémon.filter( val => val.id > 99 ).map( val => val.name );
    console.log("Fifth ",bListPkmn5);
    const bListPkmn6   = pokémon.filter( val => val.types.includes("poison")).map( val => val.name );
    console.log("Sexth ",bListPkmn6);

    const bListPkmn7   = pokémon.filter( val => val.types[1]=="flying").map( val => val.types[0] );
    console.log("Sevenieth ",bListPkmn7); 
    const bListPkmn8   = pokémon.filter( val => val.types.includes("normal"));
    console.log("Final ",bListPkmn8.length);    



