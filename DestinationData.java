package com.example.tourmate;

import java.util.ArrayList;
import java.util.List;

public class DestinationData {

    public static List<Destination> getDestinations() {

        List<Destination> list = new ArrayList<>();

        // =========================
        // 28 STATES
        // =========================

        list.add(new Destination(
                "Andhra Pradesh", "State", "🌊",
                "Andhra Pradesh is a coastal state known for beaches, temples, valleys and rich cultural heritage.",
                "Tirupati Temple\nAraku Valley\nVisakhapatnam\nBorra Caves\nVijayawada",
                "Carry comfortable footwear for temple visits. Coastal areas can be hot, so carry water and sunscreen.",
                "October to March",
                15.9129, 79.7400,
                "andhra pradesh andhra tirupati araku visakhapatnam vizag"));

        list.add(new Destination(
                "Arunachal Pradesh", "State", "🏔️",
                "Arunachal Pradesh is known for Himalayan landscapes, monasteries, forests and scenic valleys.",
                "Tawang\nZiro Valley\nBomdila\nSela Pass\nNamdapha National Park",
                "Carry warm clothes. Check permit requirements before travelling.",
                "October to April",
                28.2180, 94.7278,
                "arunachal arunachal pradesh tawang ziro"));

        list.add(new Destination(
                "Assam", "State", "🦏",
                "Assam is famous for tea gardens, wildlife, the Brahmaputra River and vibrant culture.",
                "Kaziranga National Park\nMajuli\nGuwahati\nSivasagar\nTea Gardens",
                "Wildlife safaris are best booked in advance. Carry light cotton clothes and insect repellent.",
                "October to April",
                26.2006, 92.9376,
                "assam kaziranga guwahati majuli"));

        list.add(new Destination(
                "Bihar", "State", "🛕",
                "Bihar has immense historical and religious importance and is associated with Buddhism and ancient India.",
                "Bodh Gaya\nNalanda\nRajgir\nPatna\nVaishali",
                "Respect local religious customs and dress appropriately when visiting temples.",
                "October to March",
                25.0961, 85.3131,
                "bihar bodh gaya nalanda patna rajgir"));

        list.add(new Destination(
                "Chhattisgarh", "State", "🌳",
                "Chhattisgarh is known for forests, waterfalls, tribal culture and ancient temples.",
                "Chitrakote Falls\nTirathgarh Falls\nBarnawapara Wildlife Sanctuary\nBastar\nSirpur",
                "Monsoon is beautiful for waterfalls, but roads may become difficult.",
                "October to March",
                21.2787, 81.8661,
                "chhattisgarh bastar chitrakote tirathgarh"));

        list.add(new Destination(
                "Goa", "State", "🏖️",
                "Goa is famous for beautiful beaches, Portuguese heritage, nightlife and relaxed coastal tourism.",
                "Baga Beach\nCalangute Beach\nFort Aguada\nBasilica of Bom Jesus\nDudhsagar Falls",
                "Carry sunscreen and stay hydrated. Respect beach safety rules.",
                "November to February",
                15.2993, 74.1240,
                "goa beaches baga calangute panaji dudhsagar"));

        list.add(new Destination(
                "Gujarat", "State", "🦁",
                "Gujarat offers heritage sites, temples, wildlife and the unique landscape of the Rann of Kutch.",
                "Rann of Kutch\nGir National Park\nSomnath\nDwarka\nAhmedabad",
                "Winters are ideal for sightseeing. Book Rann accommodation early during festivals.",
                "November to February",
                22.2587, 71.1924,
                "gujarat rann kutch gir somnath dwarka ahmedabad"));

        list.add(new Destination(
                "Haryana", "State", "🏛️",
                "Haryana is known for historical sites, pilgrimage locations and its proximity to Delhi.",
                "Kurukshetra\nSultanpur National Park\nPanipat\nPanchkula\nMorni Hills",
                "Winter is comfortable for outdoor sightseeing.",
                "October to March",
                29.0588, 76.0856,
                "haryana kurukshetra panipat morni"));

        list.add(new Destination(
                "Himachal Pradesh", "State", "🏔️",
                "Himachal Pradesh is a Himalayan state famous for mountains, valleys, snow and hill stations.",
                "Shimla\nManali\nKasol\nDharamshala\nSpiti Valley",
                "Carry warm clothes in winter. Mountain roads can take longer than expected.",
                "March to June and October to February",
                31.1048, 77.1734,
                "himachal himachal pradesh shimla manali kasol dharamshala"));

        list.add(new Destination(
                "Jharkhand", "State", "💧",
                "Jharkhand is known for forests, waterfalls, wildlife and tribal heritage.",
                "Dassam Falls\nHundru Falls\nBetla National Park\nNetarhat\nDeoghar",
                "Wear comfortable shoes when visiting waterfalls and forest areas.",
                "October to February",
                23.6102, 85.2799,
                "jharkhand ranchi deoghar netarhat waterfalls"));

        list.add(new Destination(
                "Karnataka", "State", "🏛️",
                "Karnataka combines historic architecture, technology, wildlife, beaches and hill stations.",
                "Hampi\nMysore Palace\nCoorg\nBengaluru\nGokarna",
                "Plan separate days for heritage sites and nature destinations.",
                "October to February",
                15.3173, 75.7139,
                "karnataka hampi mysore bengaluru coorg gokarna"));

        list.add(new Destination(
                "Kerala", "State", "🌴",
                "Kerala is famous for backwaters, beaches, hill stations, Ayurveda and lush green landscapes.",
                "Munnar\nAlleppey\nWayanad\nKochi\nThekkady",
                "Carry light clothes and an umbrella. Book houseboats in advance during peak season.",
                "September to March",
                10.8505, 76.2711,
                "kerala munnar alleppey alappuzha kochi wayanad"));

        list.add(new Destination(
                "Madhya Pradesh", "State", "🐯",
                "Madhya Pradesh is rich in heritage, wildlife, temples and historical monuments.",
                "Khajuraho\nSanchi\nKanha National Park\nBandhavgarh\nUjjain",
                "Wildlife safaris should be booked beforehand.",
                "October to March",
                22.9734, 78.6569,
                "madhya pradesh mp khajuraho sanchi kanha ujjain"));

        list.add(new Destination(
                "Maharashtra", "State", "🏙️",
                "Maharashtra is known for Mumbai, forts, caves, beaches, hill stations and rich Maratha heritage.",
                "Mumbai\nPune\nLonavala\nMahabaleshwar\nAjanta and Ellora Caves\nNashik",
                "Monsoon is excellent for hill stations and waterfalls. Keep comfortable footwear for forts.",
                "October to February",
                19.7515, 75.7139,
                "maharashtra mumbai pune lonavala mahableshwar ajanta ellora nashik"));

        list.add(new Destination(
                "Manipur", "State", "🌸",
                "Manipur is known for beautiful landscapes, lakes, cultural traditions and natural beauty.",
                "Loktak Lake\nImphal\nKeibul Lamjao National Park\nKangla Fort",
                "Carry comfortable clothing and check local travel conditions.",
                "October to March",
                24.6637, 93.9063,
                "manipur imphal loktak kangla"));

        list.add(new Destination(
                "Meghalaya", "State", "🌧️",
                "Meghalaya is famous for waterfalls, caves, living root bridges and green hills.",
                "Shillong\nCherrapunji\nMawlynnong\nDawki\nLiving Root Bridges",
                "Carry rain protection. Roads can be slippery during heavy rainfall.",
                "October to April",
                25.4670, 91.3662,
                "meghalaya shillong cherrapunji dawki mawlynnong"));

        list.add(new Destination(
                "Mizoram", "State", "⛰️",
                "Mizoram is known for peaceful hills, forests and scenic landscapes.",
                "Aizawl\nReiek\nDurtlang Hills\nVantawng Falls",
                "Plan transportation in advance because destinations are spread across hilly terrain.",
                "October to March",
                23.1645, 92.9376,
                "mizoram aizawl reiek vantawng"));

        list.add(new Destination(
                "Nagaland", "State", "🏔️",
                "Nagaland is known for its hills, tribal traditions, festivals and beautiful landscapes.",
                "Kohima\nDzukou Valley\nHornbill Festival\nKhonoma",
                "Respect local customs and traditions.",
                "October to May",
                26.1584, 94.5624,
                "nagaland kohima dzukou hornbill khonoma"));

        list.add(new Destination(
                "Odisha", "State", "🛕",
                "Odisha is famous for ancient temples, beaches, classical culture and wildlife.",
                "Puri\nKonark Sun Temple\nBhubaneswar\nChilika Lake\nUdayagiri Caves",
                "Dress appropriately when visiting religious places.",
                "October to March",
                20.9517, 85.0985,
                "odisha odissa puri konark bhubaneswar chilika"));

        list.add(new Destination(
                "Punjab", "State", "🛕",
                "Punjab is known for its vibrant culture, historical heritage, food and religious landmarks.",
                "Golden Temple\nJallianwala Bagh\nWagah Border\nAmritsar\nAnandpur Sahib",
                "Visit religious sites respectfully and cover your head where required.",
                "October to March",
                31.1471, 75.3412,
                "punjab amritsar golden temple wagah"));

        list.add(new Destination(
                "Rajasthan", "State", "🏰",
                "Rajasthan is famous for magnificent forts, palaces, deserts and royal heritage.",
                "Jaipur\nUdaipur\nJodhpur\nJaisalmer\nPushkar",
                "Carry sunscreen and stay hydrated. Winter is much more comfortable for desert trips.",
                "October to March",
                27.0238, 74.2179,
                "rajasthan jaipur udaipur jodhpur jaisalmer pushkar"));

        list.add(new Destination(
                "Sikkim", "State", "🏔️",
                "Sikkim is a Himalayan state known for monasteries, mountain views and peaceful landscapes.",
                "Gangtok\nTsomgo Lake\nNathula Pass\nPelling\nLachung",
                "Carry warm clothes. Some high-altitude areas require permits.",
                "March to May and October to December",
                27.5330, 88.5122,
                "sikkim gangtok nathula pelling lachung"));

        list.add(new Destination(
                "Tamil Nadu", "State", "🛕",
                "Tamil Nadu is famous for ancient temples, beaches, heritage architecture and hill stations.",
                "Chennai\nOoty\nMadurai\nMahabalipuram\nRameswaram",
                "Dress modestly when visiting temples.",
                "October to March",
                11.1271, 78.6569,
                "tamil nadu tamilnadu chennai ooty madurai rameswaram"));

        list.add(new Destination(
                "Telangana", "State", "🏰",
                "Telangana combines historic forts, monuments, lakes and modern city attractions.",
                "Hyderabad\nCharminar\nGolconda Fort\nWarangal\nRamoji Film City",
                "Start sightseeing early to avoid afternoon heat.",
                "October to February",
                18.1124, 79.0193,
                "telangana hyderabad charminar golconda warangal"));

        list.add(new Destination(
                "Tripura", "State", "🏛️",
                "Tripura is known for palaces, temples, forests and cultural heritage.",
                "Agartala\nUjjayanta Palace\nNeermahal\nUnakoti\nSepahijala",
                "Keep some flexibility in your itinerary for local transportation.",
                "October to March",
                23.9408, 91.9882,
                "tripura agartala neermahal unakoti"));

        list.add(new Destination(
                "Uttar Pradesh", "State", "🕌",
                "Uttar Pradesh has some of India's most important historical, cultural and religious attractions.",
                "Taj Mahal\nVaranasi\nAgra Fort\nAyodhya\nLucknow",
                "Allow extra time for crowded heritage and religious areas.",
                "October to March",
                26.8467, 80.9462,
                "uttar pradesh up agra taj mahal varanasi ayodhya lucknow"));

        list.add(new Destination(
                "Uttarakhand", "State", "🏔️",
                "Uttarakhand is known for Himalayan scenery, pilgrimage sites, forests and adventure tourism.",
                "Rishikesh\nMussoorie\nNainital\nKedarnath\nBadrinath",
                "Mountain weather changes quickly. Check route conditions before travelling.",
                "March to June and September to November",
                30.0668, 79.0193,
                "uttarakhand rishikesh mussoorie nainital kedarnath badrinath"));

        list.add(new Destination(
                "West Bengal", "State", "🐯",
                "West Bengal offers colonial heritage, cultural attractions, Himalayan landscapes and mangrove forests.",
                "Kolkata\nDarjeeling\nSundarbans\nVictoria Memorial\nKalimpong",
                "Carry warm clothes for Darjeeling and comfortable footwear for city sightseeing.",
                "October to March",
                22.9868, 87.8550,
                "west bengal kolkata darjeeling sundarbans kalimpong"));

        // =========================
        // 8 UNION TERRITORIES
        // =========================

        list.add(new Destination(
                "Andaman and Nicobar Islands", "Union Territory", "🏝️",
                "The Andaman and Nicobar Islands are known for tropical beaches, coral reefs and marine activities.",
                "Port Blair\nHavelock Island\nRadhanagar Beach\nNeil Island\nCellular Jail",
                "Use reef-safe sunscreen and follow local marine safety instructions.",
                "October to May",
                11.7401, 92.6586,
                "andaman nicobar port blair havelock radhanagar"));

        list.add(new Destination(
                "Chandigarh", "Union Territory", "🌳",
                "Chandigarh is a planned city known for modern architecture, gardens and urban design.",
                "Rock Garden\nSukhna Lake\nRose Garden\nCapitol Complex",
                "Use public transport or cabs for convenient city sightseeing.",
                "October to March",
                30.7333, 76.7794,
                "chandigarh rock garden sukhna"));

        list.add(new Destination(
                "Dadra and Nagar Haveli and Daman and Diu", "Union Territory", "🌴",
                "This Union Territory offers beaches, Portuguese heritage and scenic natural attractions.",
                "Daman\nDiu Fort\nDevka Beach\nNagar Haveli\nSilvassa",
                "Carry sunscreen and plan beach visits around comfortable weather.",
                "October to March",
                20.1809, 73.0169,
                "daman diu silvassa dadra nagar haveli devka"));

        list.add(new Destination(
                "Delhi", "Union Territory", "🏛️",
                "Delhi is India's capital and combines historic monuments, museums, markets and modern attractions.",
                "India Gate\nRed Fort\nQutub Minar\nLotus Temple\nHumayun's Tomb",
                "Use metro for convenient city travel and avoid peak afternoon heat.",
                "October to March",
                28.6139, 77.2090,
                "delhi new delhi red fort qutub india gate lotus"));

        list.add(new Destination(
                "Jammu and Kashmir", "Union Territory", "🏔️",
                "Jammu and Kashmir is known for Himalayan scenery, lakes, gardens and beautiful valleys.",
                "Srinagar\nGulmarg\nPahalgam\nSonamarg\nDal Lake",
                "Mountain weather can change quickly. Carry layers and check travel conditions.",
                "March to October",
                33.7782, 76.5762,
                "jammu kashmir jammu kashmir srinagar gulmarg pahalgam"));

        list.add(new Destination(
                "Ladakh", "Union Territory", "🏔️",
                "Ladakh is a high-altitude region famous for dramatic mountains, monasteries and clear lakes.",
                "Leh\nPangong Lake\nNubra Valley\nKhardung La\nThiksey Monastery",
                "Acclimatize before travelling to high-altitude locations and stay hydrated.",
                "May to September",
                34.1526, 77.5771,
                "ladakh leh pangong nubra khardungla"));

        list.add(new Destination(
                "Lakshadweep", "Union Territory", "🏝️",
                "Lakshadweep is an island destination known for turquoise waters, coral reefs and beaches.",
                "Agatti\nBangaram\nKavaratti\nKadmat\nMinicoy",
                "Check entry and permit requirements before planning your trip.",
                "October to May",
                10.5667, 72.6417,
                "lakshadweep agatti bangaram kavaratti kadmat"));

        list.add(new Destination(
                "Puducherry", "Union Territory", "🌊",
                "Puducherry is known for French colonial architecture, beaches, cafés and peaceful streets.",
                "Promenade Beach\nAuroville\nSri Aurobindo Ashram\nFrench Quarter\nParadise Beach",
                "Renting a bicycle or scooter can be convenient for exploring the city.",
                "October to March",
                11.9416, 79.8083,
                "puducherry pondicherry auroville promenade paradise beach"));

        // =========================
        // MAJOR TOURIST DESTINATIONS
        // =========================

        list.add(new Destination(
                "Kashmir", "Tourist Region", "🏔️",
                "Kashmir is renowned for its beautiful valleys, lakes, gardens and Himalayan landscapes. It is often called the Paradise on Earth.",
                "Srinagar\nDal Lake\nGulmarg\nPahalgam\nSonamarg\nMughal Gardens",
                "Carry warm layers, especially in winter. Check weather and road conditions before visiting mountain areas.",
                "March to October",
                34.0837, 74.7973,
                "kashmir kashmir valley paradise srinagar gulmarg pahalgam sonamarg"));

        list.add(new Destination(
                "Mumbai", "City", "🌆",
                "Mumbai is India's major financial and entertainment centre, known for its coastline, heritage buildings and vibrant culture.",
                "Gateway of India\nMarine Drive\nElephanta Caves\nChhatrapati Shivaji Maharaj Terminus\nColaba",
                "Use local trains or metro where convenient. Avoid peak traffic hours for road travel.",
                "October to February",
                19.0760, 72.8777,
                "mumbai bombay marine drive gateway india colaba"));

        list.add(new Destination(
                "Pune", "City", "🏛️",
                "Pune is a historic city known for Maratha heritage, educational institutions, food and nearby hill stations.",
                "Shaniwar Wada\nAga Khan Palace\nSinhagad Fort\nPataleshwar Cave Temple",
                "Start outdoor sightseeing early and carry water.",
                "October to February",
                18.5204, 73.8567,
                "pune shaniwar wada sinhagad aga khan"));

        list.add(new Destination(
                "Jaipur", "City", "🏰",
                "Jaipur, the Pink City, is famous for magnificent palaces, forts, markets and colourful Rajasthani culture.",
                "Amber Fort\nHawa Mahal\nCity Palace\nJantar Mantar\nNahargarh Fort",
                "Wear comfortable shoes and carry sunscreen.",
                "October to March",
                26.9124, 75.7873,
                "jaipur pink city amber hawa mahal city palace"));

        list.add(new Destination(
                "Agra", "City", "🕌",
                "Agra is a historic city famous for Mughal architecture and the Taj Mahal.",
                "Taj Mahal\nAgra Fort\nMehtab Bagh\nItmad-ud-Daulah",
                "Start early to visit the Taj Mahal and avoid the busiest hours.",
                "October to March",
                27.1767, 78.0081,
                "agra taj mahal agra fort mehtab"));

        list.add(new Destination(
                "Taj Mahal", "Tourist Site", "🕌",
                "The Taj Mahal is a world-famous monument in Agra known for its white marble architecture and Mughal design.",
                "Main Mausoleum\nCharbagh Gardens\nYamuna River View\nAgra Fort nearby",
                "Check visiting days and ticket rules before travelling. Comfortable footwear is recommended.",
                "October to March",
                27.1751, 78.0421,
                "taj mahal tajmahal agra monument"));

        list.add(new Destination(
                "Manali", "Hill Station", "🏔️",
                "Manali is a popular Himalayan destination known for mountains, rivers, valleys and adventure activities.",
                "Solang Valley\nRohtang region\nHadimba Temple\nOld Manali\nManali Mall Road",
                "Carry warm clothes and check road/weather conditions before mountain trips.",
                "October to June",
                32.2432, 77.1892,
                "manali himachal solang rohtang old manali"));

        list.add(new Destination(
                "Srinagar", "City", "🌸",
                "Srinagar is famous for Dal Lake, houseboats, Mughal gardens and the scenic Kashmir Valley.",
                "Dal Lake\nMughal Gardens\nShikara Ride\nHazratbal Shrine\nPari Mahal",
                "Carry layers because temperatures can change quickly.",
                "March to October",
                34.0837, 74.7973,
                "srinagar kashmir dal lake shikara"));

        list.add(new Destination(
                "Varanasi", "City", "🛕",
                "Varanasi is one of India's oldest living cities and is famous for its ghats, temples and spiritual traditions.",
                "Dashashwamedh Ghat\nGanga Aarti\nKashi Vishwanath Temple\nSarnath",
                "Respect local religious customs and be careful around crowded ghats.",
                "October to March",
                25.3176, 82.9739,
                "varanasi banaras kashi ganga ghat"));

        return list;
    }
}