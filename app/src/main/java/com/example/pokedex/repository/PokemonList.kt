package com.example.pokedex.repository

import com.example.pokedex.R
import com.example.pokedex.model.Pokemon

class PokemonList {

    val pokemonList: List<Pokemon> = listOf(

        //Lista de Pokémon da primeira geração

        Pokemon(R.drawable.p1, "#001", "Bulbasaur", Description.BULBASAUR.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p2, "#002", "Ivysaur", Description.IVYSAUR.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p3, "#003", "Venusaur", Description.VENUSAUR.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p4, "#004", "Charmander", Description.CHARMANDER.descricao, "Fogo", null),
        Pokemon(R.drawable.p5, "#005", "Charmeleon", Description.CHARMELEON.descricao, "Fogo", null),
        Pokemon(R.drawable.p6, "#006", "Charizard", Description.CHARIZARD.descricao, "Fogo", "Voador"),
        Pokemon(R.drawable.p7, "#007", "Squirtle", Description.SQUIRTLE.descricao, "Água", null),
        Pokemon(R.drawable.p8, "#008", "Wartortle", Description.WARTORTLE.descricao, "Água", null),
        Pokemon(R.drawable.p9, "#009", "Blastoise", Description.BLASTOISE.descricao, "Água", null),
        Pokemon(R.drawable.p10, "#010", "Caterpie", Description.CATERPIE.descricao, "Inseto", null),
        Pokemon(R.drawable.p11, "#011", "Metapod", Description.METAPOD.descricao, "Inseto", null),
        Pokemon(R.drawable.p12, "#012", "Butterfree", Description.BUTTERFREE.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p13, "#013", "Weedle", Description.WEEDLE.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p14, "#014", "Kakuna", Description.KAKUNA.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p15, "#015", "Beedrill", Description.BEEDRILL.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p16, "#016", "Pidgey", Description.PIDGEY.descricao, "Voador", "Normal"),
        Pokemon(R.drawable.p17, "#017", "Pidgeotto", Description.PIDGEOTTO.descricao, "Voador", "Normal"),
        Pokemon(R.drawable.p18, "#018", "Pidgeot", Description.PIDGEOT.descricao, "Voador", "Normal"),
        Pokemon(R.drawable.p19, "#019", "Rattata", Description.RATTATA.descricao, "Normal", null),
        Pokemon(R.drawable.p20, "#020", "Raticate", Description.RATICATE.descricao, "Normal", null),
        Pokemon(R.drawable.p21, "#021", "Spearow", Description.SPEAROW.descricao, "Voador", "Normal"),
        Pokemon(R.drawable.p22, "#022", "Fearow", Description.FEAROW.descricao, "Voador", "Normal"),
        Pokemon(R.drawable.p23, "#023", "Ekans", Description.EKANS.descricao,"Venenoso", null),
        Pokemon(R.drawable.p24, "#024", "Arbok", Description.ARBOK.descricao,"Venenoso", null),
        Pokemon(R.drawable.p25, "#025", "Pikachu", Description.PIKACHU.descricao,"Elétrico", null),
        Pokemon(R.drawable.p26, "#026", "Raichu", Description.RAICHU.descricao,"Elétrico", null),
        Pokemon(R.drawable.p27, "#027", "Sandshrew", Description.SANDSHREW.descricao,"Terra", null),
        Pokemon(R.drawable.p28, "#028", "Sandslash", Description.SANDSLASH.descricao,"Terra", null),
        Pokemon(R.drawable.p29, "#029", "Nidoran ♀", Description.NIDORANF.descricao,"Venenoso", null),
        Pokemon(R.drawable.p30, "#030", "Nidorina", Description.NIDORINA.descricao,"Venenoso", null),
        Pokemon(R.drawable.p31, "#031", "Nidoqueen", Description.NIDOQUEEN.descricao,"Venenoso", "Terra"),
        Pokemon(R.drawable.p32, "#032", "Nidoran ♂", Description.NIDORANM.descricao,"Venenoso", null),
        Pokemon(R.drawable.p33, "#033", "Nidorino", Description.NIDORINO.descricao,"Venenoso", null),
        Pokemon(R.drawable.p34, "#034", "Nidoking", Description.NIDOKING.descricao,"Venenoso", "Terra"),
        Pokemon(R.drawable.p35, "#035", "Clefairy", Description.CLEFAIRY.descricao,"Fada", null),
        Pokemon(R.drawable.p36, "#036", "Clefable", Description.CLEFABLE.descricao,"Fada", null),
        Pokemon(R.drawable.p37, "#037", "Vulpix", Description.VULPIX.descricao, "Fogo", null),
        Pokemon(R.drawable.p38, "#038", "Ninetales", Description.NINETALES.descricao, "Fogo", null),
        Pokemon(R.drawable.p39, "#039", "Jigglypuff", Description.JIGGLYPUFF.descricao, "Normal", "Fada"),
        Pokemon(R.drawable.p40, "#040", "Wigglytuff", Description.WIGGLYTUFF.descricao, "Normal", "Fada"),
        Pokemon(R.drawable.p41, "#041", "Zubat", Description.ZUBAT.descricao, "Venenoso", "Voador"),
        Pokemon(R.drawable.p42, "#042", "Golbat", Description.GOLBAT.descricao, "Venenoso", "Voador"),
        Pokemon(R.drawable.p43, "#043", "Oddish", Description.ODDISH.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p44, "#044", "Gloom", Description.GLOOM.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p45, "#045", "Vileplume", Description.VILEPLUME.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p46, "#046", "Paras", "Inseto", Description.PARAS.descricao, "Grama"),
        Pokemon(R.drawable.p47, "#047", "Parasect", Description.PARASECT.descricao, "Inseto", "Grama"),
        Pokemon(R.drawable.p48, "#048", "Venonat", Description.VENONAT.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p49, "#049", "Venomoth", Description.VENOMOTH.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p50, "#050", "Diglett", Description.DIGLETT.descricao, "Terra", null),
        Pokemon(R.drawable.p51, "#051", "Dugtrio", Description.DUGTRIO.descricao, "Terra", null),
        Pokemon(R.drawable.p52, "#052", "Meowth", Description.MEOWTH.descricao, "Normal", null),
        Pokemon(R.drawable.p53, "#053", "Persian", Description.PERSIAN.descricao, "Normal", null),
        Pokemon(R.drawable.p54, "#054", "Psyduck", Description.PSYDUCK.descricao, "Água", null),
        Pokemon(R.drawable.p55, "#055", "Golduck", Description.GOLDUCK.descricao, "Água", null),
        Pokemon(R.drawable.p56, "#056", "Mankey", Description.MANKEY.descricao, "Lutador", null),
        Pokemon(R.drawable.p57, "#057", "Primeape", Description.PRIMEAPE.descricao, "Lutador", null),
        Pokemon(R.drawable.p58, "#058", "Growlithe", Description.GROWLITHE.descricao, "Fogo", null),
        Pokemon(R.drawable.p59, "#059", "Arcanine", Description.ARCANINE.descricao, "Fogo", null),
        Pokemon(R.drawable.p60, "#060", "Poliwag", Description.POLIWAG.descricao, "Água", null),
        Pokemon(R.drawable.p61, "#061", "Poliwhirl", Description.POLIWHIRL.descricao, "Água", null),
        Pokemon(R.drawable.p62, "#062", "Poliwrath", Description.POLIWRATH.descricao, "Água", "Lutador"),
        Pokemon(R.drawable.p63, "#063", "Abra", Description.ABRA.descricao, "Psíquico", null),
        Pokemon(R.drawable.p64, "#064", "Kadabra", Description.KADABRA.descricao, "Psíquico", null),
        Pokemon(R.drawable.p65, "#065", "Alakazam", Description.ALAKAZAM.descricao, "Psíquico", null),
        Pokemon(R.drawable.p66, "#066", "Machop", Description.MACHOP.descricao, "Lutador", null),
        Pokemon(R.drawable.p67, "#067", "Machoke", Description.MACHOKE.descricao, "Lutador", null),
        Pokemon(R.drawable.p68, "#068", "Machamp", Description.MACHAMP.descricao, "Lutador", null),
        Pokemon(R.drawable.p69, "#069", "Bellsprout", Description.BELLSPROUT.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p70, "#070", "Weepinbell", Description.WEEPINBELL.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p71, "#071", "Victreebel", Description.VICTREEBELL.descricao, "Grama", "Venenoso"),
        Pokemon(R.drawable.p72, "#072", "Tentacool", Description.TENTACOOL.descricao, "Água", "Venenoso"),
        Pokemon(R.drawable.p73, "#073", "Tentacruel", Description.TENTACRUEL.descricao, "Água", "Venenoso"),
        Pokemon(R.drawable.p74, "#074", "Geodude", Description.GEODUDE.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p75, "#075", "Graveler", Description.GRAVELER.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p76, "#076", "Golem", Description.GOLEM.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p77, "#077", "Ponyta", Description.PONYTA.descricao, "Fogo", null),
        Pokemon(R.drawable.p78, "#078", "Rapidash", Description.RAPIDASH.descricao, "Fogo", null),
        Pokemon(R.drawable.p79, "#079", "Slowpoke", Description.SLOWPOKE.descricao, "Água", "Psíquico"),
        Pokemon(R.drawable.p80, "#080", "Slowbro", Description.SLOWBRO.descricao, "Água", "Psíquico"),
        Pokemon(R.drawable.p81, "#081", "Magnemite", Description.MAGNEMITE.descricao, "Elétrico", "Metal"),
        Pokemon(R.drawable.p82, "#082", "Magneton", Description.MAGNETON.descricao, "Elétrico", "Metal"),
        Pokemon(R.drawable.p83, "#083", "Farfetch'd", Description.FARFETCHD.descricao, "Normal", "Voador"),
        Pokemon(R.drawable.p84, "#084", "Doduo", Description.DODUO.descricao, "Normal", "Voador"),
        Pokemon(R.drawable.p85, "#085", "Dodrio", Description.DODRIO.descricao, "Normal", "Voador"),
        Pokemon(R.drawable.p86, "#086", "Seel", Description.SEEL.descricao, "Água", null),
        Pokemon(R.drawable.p87, "#087", "Dewgong", Description.DEWGONG.descricao, "Água", "Gelo"),
        Pokemon(R.drawable.p88, "#088", "Grimer", Description.GRIMER.descricao, "Venenoso", null),
        Pokemon(R.drawable.p89, "#089", "Muk", Description.MUK.descricao, "Venenoso", null),
        Pokemon(R.drawable.p90, "#090", "Shellder", Description.SHELLDER.descricao, "Água", null),
        Pokemon(R.drawable.p91, "#091", "Cloyster", Description.CLOYSTER.descricao, "Água", "Gelo"),
        Pokemon(R.drawable.p92, "#092", "Gastly", Description.GASTLY.descricao, "Fantasma", "Venenoso"),
        Pokemon(R.drawable.p93, "#093", "Haunter", Description.HAUNTER.descricao, "Fantasma", "Venenoso"),
        Pokemon(R.drawable.p94, "#094", "Gengar", Description.GENGAR.descricao, "Fantasma", "Venenoso"),
        Pokemon(R.drawable.p95, "#095", "Onix", Description.ONIX.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p96, "#096", "Drowzee", Description.DROWZEE.descricao, "Psíquico", null),
        Pokemon(R.drawable.p97, "#097", "Hypno", Description.HYPNO.descricao, "Psíquico", null),
        Pokemon(R.drawable.p98, "#098", "Krabby", Description.KRABBY.descricao, "Água", null),
        Pokemon(R.drawable.p99, "#099", "Kingler", Description.KINGLER.descricao, "Água", null),
        Pokemon(R.drawable.p100, "#100", "Voltorb", Description.VOLTORB.descricao, "Elétrico", null),
        Pokemon(R.drawable.p101, "#101", "Electrode", Description.ELECTRODE.descricao, "Elétrico", null),
        Pokemon(R.drawable.p102, "#102", "Exeggcute", Description.EXEGGCUTE.descricao, "Grama", "Psíquico"),
        Pokemon(R.drawable.p103, "#103", "Exeggutor", Description.EXEGGUTOR.descricao, "Grama", "Psíquico"),
        Pokemon(R.drawable.p104, "#104", "Cubone", Description.CUBONE.descricao, "Terra", null),
        Pokemon(R.drawable.p105, "#105", "Marowak", Description.MAROWAK.descricao, "Terra", null),
        Pokemon(R.drawable.p106, "#106", "Hitmonlee", Description.HITMONLEE.descricao, "Lutador", null),
        Pokemon(R.drawable.p107, "#107", "Hitmonchan", Description.HITMONCHAN.descricao, "Lutador", null),
        Pokemon(R.drawable.p108, "#108", "Lickitung", Description.LICKITUNG.descricao, "Normal", null),
        Pokemon(R.drawable.p109, "#109", "Koffing", Description.KOFFING.descricao, "Venenoso", null),
        Pokemon(R.drawable.p110, "#110", "Weezing", Description.WEEZING.descricao, "Venenoso", null),
        Pokemon(R.drawable.p111, "#111", "Rhyhorn", Description.RHYHORN.descricao, "Terra", "Pedra"),
        Pokemon(R.drawable.p112, "#112", "Rhydon", Description.RHYDON.descricao, "Terra", "Pedra"),
        Pokemon(R.drawable.p113, "#113", "Chansey", Description.CHANSEY.descricao, "Normal", null),
        Pokemon(R.drawable.p114, "#114", "Tangela", Description.TANGELA.descricao, "Grama", null),
        Pokemon(R.drawable.p115, "#115", "Kangaskhan", Description.KANGASKHAN.descricao, "Normal", null),
        Pokemon(R.drawable.p116, "#116", "Horsea", Description.HORSEA.descricao, "Água", null),
        Pokemon(R.drawable.p117, "#117", "Seadra", Description.SEADRA.descricao, "Água", null),
        Pokemon(R.drawable.p118, "#118", "Goldeen", Description.GOLDEEN.descricao, "Água", null),
        Pokemon(R.drawable.p119, "#119", "Seaking", Description.SEAKING.descricao, "Água", null),
        Pokemon(R.drawable.p120, "#120", "Staryu", Description.STARYU.descricao, "Água", null),
        Pokemon(R.drawable.p121, "#121", "Starmie", Description.STARMIE.descricao, "Água", "Psíquico"),
        Pokemon(R.drawable.p122, "#122", "Mr. Mime", Description.MRMIME.descricao, "Psíquico", "Fada"),
        Pokemon(R.drawable.p123, "#123", "Scyther", Description.SCYTHER.descricao, "Inseto", "Voador"),
        Pokemon(R.drawable.p124, "#124", "Jynx", Description.JYNX.descricao, "Gelo", "Psíquico"),
        Pokemon(R.drawable.p125, "#125", "Electabuzz", Description.ELECTABUZZ.descricao, "Elétrico", null),
        Pokemon(R.drawable.p126, "#126", "Magmar", Description.MAGMAR.descricao, "Fogo", null),
        Pokemon(R.drawable.p127, "#127", "Pinsir", Description.PINSIR.descricao, "Inseto", null),
        Pokemon(R.drawable.p128, "#128", "Tauros", Description.TAUROS.descricao, "Normal", null),
        Pokemon(R.drawable.p129, "#129", "Magikarp", Description.MAGIKARP.descricao, "Água", null),
        Pokemon(R.drawable.p130, "#130", "Gyarados", Description.GYARADOS.descricao, "Água", "Voador"),
        Pokemon(R.drawable.p131, "#131", "Lapras", Description.LAPRAS.descricao, "Água", "Gelo"),
        Pokemon(R.drawable.p132, "#132", "Ditto", Description.DITTO.descricao, "Normal", null),
        Pokemon(R.drawable.p133, "#133", "Eevee", Description.EEVEE.descricao, "Normal", null),
        Pokemon(R.drawable.p134, "#134", "Vaporeon", Description.VAPOREON.descricao, "Água", null),
        Pokemon(R.drawable.p135, "#135", "Jolteon", Description.JOLTEON.descricao, "Elétrico", null),
        Pokemon(R.drawable.p136, "#136", "Flareon", Description.FLAREON.descricao, "Fogo", null),
        Pokemon(R.drawable.p137, "#137", "Porygon", Description.PORYGON.descricao, "Normal", null),
        Pokemon(R.drawable.p138, "#138", "Omanyte", Description.OMANYTE.descricao, "Pedra", "Água"),
        Pokemon(R.drawable.p139, "#139", "Omastar", Description.OMASTAR.descricao, "Pedra", "Água"),
        Pokemon(R.drawable.p140, "#140", "Kabuto", Description.KABUTO.descricao, "Pedra", "Água"),
        Pokemon(R.drawable.p141, "#141", "Kabutops", Description.KABUTOPS.descricao, "Pedra", "Água"),
        Pokemon(R.drawable.p142, "#142", "Aerodactyl", Description.AERODACTYL.descricao, "Pedra", "Voador"),
        Pokemon(R.drawable.p143, "#143", "Snorlax", Description.SNORLAX.descricao, "Normal", null),
        Pokemon(R.drawable.p144, "#144", "Articuno", Description.ARTICUNO.descricao, "Gelo", "Voador"),
        Pokemon(R.drawable.p145, "#145", "Zapdos", Description.ZAPDOS.descricao, "Elétrico", "Voador"),
        Pokemon(R.drawable.p146, "#146", "Moltres", Description.MOLTRES.descricao, "Fogo", "Voador"),
        Pokemon(R.drawable.p147, "#147", "Dratini", Description.DRATINI.descricao, "Dragão", null),
        Pokemon(R.drawable.p148, "#148", "Dragonair", Description.DRAGONAIR.descricao, "Dragão", null),
        Pokemon(R.drawable.p149, "#149", "Dragonite", Description.DRAGONITE.descricao, "Dragão", null),
        Pokemon(R.drawable.p150, "#150", "Mewtwo", Description.MEWTWO.descricao, "Psíquico", null),
        Pokemon(R.drawable.p151, "#151", "Mew", Description.MEW.descricao, "Psíquico", null),

    //Lista de Pokémon da segunda geração

        Pokemon(R.drawable.p152, "#152", "Chikorita", Description.CHIKORITA.descricao, "Grama", null),
        Pokemon(R.drawable.p153, "#153", "Bayleef", Description.BAYLEEF.descricao, "Grama", null),
        Pokemon(R.drawable.p154, "#154", "Meganium", Description.MEGANIUM.descricao, "Grama", null),
        Pokemon(R.drawable.p155, "#155", "Cyndaquil", Description.CYNDAQUIL.descricao, "Fogo", null),
        Pokemon(R.drawable.p156, "#156", "Quilava", Description.QUILAVA.descricao, "Fogo", null),
        Pokemon(R.drawable.p157, "#157", "Typhlosion", Description.TYPHLOSION.descricao, "Fogo", null),
        Pokemon(R.drawable.p158, "#158", "Totodile", Description.TOTODILE.descricao, "Água", null),
        Pokemon(R.drawable.p159, "#159", "Croconaw", Description.CROCONAW.descricao, "Água", null),
        Pokemon(R.drawable.p160, "#160", "Feraligatr", Description.FERALIGATR.descricao, "Água", null),
        Pokemon(R.drawable.p161, "#161", "Sentret", Description.SENTRET.descricao, "Normal", null),
        Pokemon(R.drawable.p162, "#162", "Furret", Description.FURRET.descricao, "Normal", null),
        Pokemon(R.drawable.p163, "#163", "Hoothoot", Description.HOOTHOOT.descricao, "Normal", "Voador"),
        Pokemon(R.drawable.p164, "#164", "Noctowl", Description.NOCTOWL.descricao, "Normal", "Voador"),
        Pokemon(R.drawable.p165, "#165", "Ledyba", Description.LEDYBA.descricao, "Inseto", "Voador"),
        Pokemon(R.drawable.p166, "#166", "Ledian", Description.LEDIAN.descricao, "Inseto", "Voador"),
        Pokemon(R.drawable.p167, "#167", "Spinarak", Description.SPINARAK.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p168, "#168", "Ariados", Description.ARIADOS.descricao, "Inseto", "Venenoso"),
        Pokemon(R.drawable.p169, "#169", "Crobat", Description.CROBAT.descricao, "Venenoso", "Voador"),
        Pokemon(R.drawable.p170, "#170", "Chinchou", Description.CHINCHOU.descricao, "Água", "Elétrico"),
        Pokemon(R.drawable.p171, "#171", "Lanturn", Description.LANTURN.descricao, "Água", "Elétrico"),
        Pokemon(R.drawable.p172, "#172", "Pichu", Description.PICHU.descricao, "Elétrico", null),
        Pokemon(R.drawable.p173, "#173", "Cleffa", Description.CLEFFA.descricao, "Fada", null),
        Pokemon(R.drawable.p174, "#174", "Igglybuff", Description.IGGLYBUFF.descricao, "Normal", "Fada"),
        Pokemon(R.drawable.p175, "#175", "Togepi", Description.TOGEPI.descricao, "Fada", null),
        Pokemon(R.drawable.p176, "#176", "Togetic", Description.TOGETIC.descricao, "Fada", "Voador"),
        Pokemon(R.drawable.p177, "#177", "Natu", Description.NATU.descricao, "Psíquico", "Voador"),
        Pokemon(R.drawable.p178, "#178", "Xatu", Description.XATU.descricao, "Psíquico", "Voador"),
        Pokemon(R.drawable.p179, "#179", "Mareep", Description.MAREEP.descricao, "Elétrico", null),
        Pokemon(R.drawable.p180, "#180", "Flaaffy", Description.FLAAFFY.descricao, "Elétrico", null),
        Pokemon(R.drawable.p181, "#181", "Ampharos", Description.AMPHAROS.descricao, "Elétrico", null),
        Pokemon(R.drawable.p182, "#182", "Bellossom", Description.BELLOSSOM.descricao, "Grama", null),
        Pokemon(R.drawable.p183, "#183", "Marill", Description.MARILL.descricao, "Água", "Fada"),
        Pokemon(R.drawable.p184, "#184", "Azumarill", Description.AZUMARILL.descricao, "Água", "Fada"),
        Pokemon(R.drawable.p185, "#185", "Sudowoodo", Description.SUDOWOODO.descricao, "Pedra", null),
        Pokemon(R.drawable.p186, "#186", "Politoed", Description.POLITOED.descricao, "Água", null),
        Pokemon(R.drawable.p187, "#187", "Hoppip", Description.HOPPIP.descricao, "Grama", "Voador"),
        Pokemon(R.drawable.p188, "#188", "Skiploom", Description.SKIPLOOM.descricao, "Grama", "Voador"),
        Pokemon(R.drawable.p189, "#189", "Jumpluff", Description.JUMPLUFF.descricao, "Grama", "Voador"),
        Pokemon(R.drawable.p190, "#190", "Aipom", Description.AIPOM.descricao, "Normal", null),
        Pokemon(R.drawable.p191, "#191", "Sunkern", Description.SUNKERN.descricao, "Grama", null),
        Pokemon(R.drawable.p192, "#192", "Sunflora", Description.SUNFLORA.descricao, "Grama", null),
        Pokemon(R.drawable.p193, "#193", "Yanma", Description.YANMA.descricao, "Inseto", "Voador"),
        Pokemon(R.drawable.p194, "#194", "Wooper", Description.WOOPER.descricao, "Água", "Terra"),
        Pokemon(R.drawable.p195, "#195", "Quagsire", Description.QUAGSIRE.descricao, "Água", "Terra"),
        Pokemon(R.drawable.p196, "#196", "Espeon", Description.ESPEON.descricao, "Psíquico", null),
        Pokemon(R.drawable.p197, "#197", "Umbreon", Description.UMBREON.descricao, "Sombra", null),
        Pokemon(R.drawable.p198, "#198", "Murkrow", Description.MURKROW.descricao, "Sombra", "Voador"),
        Pokemon(R.drawable.p199, "#199", "Slowking", Description.SLOWKING.descricao, "Água", "Psíquico"),
        Pokemon(R.drawable.p200, "#200", "Misdreavus", Description.MISDREAVUS.descricao, "Fantasma", null),
        Pokemon(R.drawable.p201, "#201", "Unown", Description.UNOWN.descricao, "Psíquico", null),
        Pokemon(R.drawable.p202, "#202", "Wobbuffet", Description.WOBBUFFET.descricao, "Psíquico", null),
        Pokemon(R.drawable.p203, "#203", "Girafarig", Description.GIRAFARIG.descricao, "Normal", "Psíquico"),
        Pokemon(R.drawable.p204, "#204", "Pineco", Description.PINECO.descricao, "Inseto", null),
        Pokemon(R.drawable.p205, "#205", "Forretress", Description.FORRETRESS.descricao, "Inseto", "Metal"),
        Pokemon(R.drawable.p206, "#206", "Dunsparce", Description.DUNSPARCE.descricao, "Normal", null),
        Pokemon(R.drawable.p207, "#207", "Gligar", Description.GLIGAR.descricao, "Terra", "Voador"),
        Pokemon(R.drawable.p208, "#208", "Steelix", Description.STEELIX.descricao, "Metal", "Terra"),
        Pokemon(R.drawable.p209, "#209", "Snubbull", Description.SNUBBULL.descricao, "Fada", null),
        Pokemon(R.drawable.p210, "#210", "Granbull", Description.GRANBULL.descricao, "Fada", null),
        Pokemon(R.drawable.p211, "#211", "Qwilfish", Description.QWILFISH.descricao, "Água", "Venenoso"),
        Pokemon(R.drawable.p212, "#212", "Scizor", Description.SCIZOR.descricao, "Inseto", "Metal"),
        Pokemon(R.drawable.p213, "#213", "Shuckle", Description.SHUCKLE.descricao, "Inseto", "Pedra"),
        Pokemon(R.drawable.p214, "#214", "Heracross", Description.HERACROSS.descricao, "Inseto", "Lutador"),
        Pokemon(R.drawable.p215, "#215", "Sneasel", Description.SNEASEL.descricao, "Sombra", "Gelo"),
        Pokemon(R.drawable.p216, "#216", "Teddiursa", Description.TEDDIURSA.descricao, "Normal", null),
        Pokemon(R.drawable.p217, "#217", "Ursaring", Description.URSARING.descricao, "Normal", null),
        Pokemon(R.drawable.p218, "#218", "Slugma", Description.SLUGMA.descricao, "Fogo", null),
        Pokemon(R.drawable.p219, "#219", "Magcargo", Description.MAGCARGO.descricao, "Fogo", "Pedra"),
        Pokemon(R.drawable.p220, "#220", "Swinub", Description.SWINUB.descricao, "Gelo", "Terra"),
        Pokemon(R.drawable.p221, "#221", "Piloswine", Description.PILOSWINE.descricao, "Gelo", "Terra"),
        Pokemon(R.drawable.p222, "#222", "Corsola", Description.CORSOLA.descricao, "Água", "Pedra"),
        Pokemon(R.drawable.p223, "#223", "Remoraid", Description.REMORAID.descricao, "Água", null),
        Pokemon(R.drawable.p224, "#224", "Octillery", Description.OCTILLERY.descricao, "Água", null),
        Pokemon(R.drawable.p225, "#225", "Delibird", Description.DELIBIRD.descricao, "Gelo", "Voador"),
        Pokemon(R.drawable.p226, "#226", "Mantine", Description.MANTINE.descricao, "Água", "Voador"),
        Pokemon(R.drawable.p227, "#227", "Skarmory", Description.SKARMORY.descricao, "Metal", "Voador"),
        Pokemon(R.drawable.p228, "#228", "Houndour", Description.HOUNDOUR.descricao, "Sombra", "Fogo"),
        Pokemon(R.drawable.p229, "#229", "Houndoom", Description.HOUNDOOM.descricao, "Sombra", "Fogo"),
        Pokemon(R.drawable.p230, "#230", "Kingdra", Description.KINGDRA.descricao, "Água", "Dragão"),
        Pokemon(R.drawable.p231, "#231", "Phanpy", Description.PHANPY.descricao, "Terra", null),
        Pokemon(R.drawable.p232, "#232", "Donphan", Description.DONPHAN.descricao, "Terra", null),
        Pokemon(R.drawable.p233, "#233", "Porygon2", Description.PORYGON2.descricao, "Normal", null),
        Pokemon(R.drawable.p234, "#234", "Stantler", Description.STANTLER.descricao, "Normal", null),
        Pokemon(R.drawable.p235, "#235", "Smeargle", Description.SMEARGLE.descricao, "Normal", null),
        Pokemon(R.drawable.p236, "#236", "Tyrogue", Description.TYROGUE.descricao, "Lutador", null),
        Pokemon(R.drawable.p237, "#237", "Hitmontop", Description.HITMONTOP.descricao, "Lutador", null),
        Pokemon(R.drawable.p238, "#238", "Smoochum", Description.SMOOCHUM.descricao, "Gelo", "Psíquico"),
        Pokemon(R.drawable.p239, "#239", "Elekid", Description.ELEKID.descricao, "Elétrico", null),
        Pokemon(R.drawable.p240, "#240", "Magby", Description.MAGBY.descricao, "Fogo", null),
        Pokemon(R.drawable.p241, "#241", "Miltank", Description.MILTANK.descricao, "Normal", null),
        Pokemon(R.drawable.p242, "#242", "Blissey", Description.BLISSEY.descricao, "Normal", null),
        Pokemon(R.drawable.p243, "#243", "Raikou", Description.RAIKOU.descricao, "Elétrico", null),
        Pokemon(R.drawable.p244, "#244", "Entei", Description.ENTEI.descricao, "Fogo", null),
        Pokemon(R.drawable.p245, "#245", "Suicune", Description.SUICUNE.descricao, "Água", null),
        Pokemon(R.drawable.p246, "#246", "Larvitar", Description.LARVITAR.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p247, "#247", "Pupitar", Description.PUPITAR.descricao, "Pedra", "Terra"),
        Pokemon(R.drawable.p248, "#248", "Tyranitar", Description.TYRANITAR.descricao, "Pedra", "Sombra"),
        Pokemon(R.drawable.p249, "#249", "Lugia", Description.LUGIA.descricao, "Psíquico", "Voador"),
        Pokemon(R.drawable.p250, "#250", "Ho-Oh", Description.HOOH.descricao, "Fogo", "Voador"),
        Pokemon(R.drawable.p251, "#251", "Celebi", Description.CELEBI.descricao, "Psíquico", "Grama")
    )

    fun getPokemon(index: Int) = pokemonList[index]
}