package com.example.prasthan
import android.content.Context
        object places {
            fun getPlace(PlaceId: Int, context: Context): Place = getPlaceList(context).find {
                it.Placeid== PlaceId
            }!!

            fun getPlaceList(context: Context) = listOf(
                Place(
                    1,
                    "Mathura-Vrindavan",
                    "Land of Lord Krishna",
                    "The temple was built in 1815 by the treasurer of the province of Gwalior, Seth Gokuldas Parikh, and is renowned globally for its excellent architecture. It is situated on the north side of Mathura, on the edge of Vishram Ghat along the banks of River Yamuna.\n" +
                            "\n" +
                            "Beautiful colours and floral designs of yellow pillars adorn the large hall of the temple, which holds the sanctum on a higher platform. The idol of Lord Krishna is absolutely stunning, sculpted out of black marble, while Radharani, his companion, has been carved in white marble. A beautiful Rajasthani-style doorway leads to a magnificent, well-maintained courtyard. Devotees can also admire the various carvings of gods and goddesses on the pillars and walls of the temple.\n" +
                            "\n" +
                            "Like most temples in Mathura, Dwarkadhish welcomes thousands of pilgrims during the festivals of Holi and Krishna Janmashtami, however, some special celebrations also take place here. The temple organises the “Hindola” festival during the month of Shravan, typically July or August. Flowers and lights brighten up every surface of the temple, which transforms into a splendid feast for photographers. Another festival, known as “Jhoola” (swing), is also observed at Dwarkadhish at the end of Shravan, and marks the beginning of the rainy season. During this time, Lord Dwarkadhish is placed on a gold and silver-plated swing for darshan.",
                    R.drawable.download
                ),
                Place(
                    2,
                    "Hampi",
                    "Romancing the ruins",
                    "A legendary lost city that was once the powerhouse of an ancient kingdom and an auspicious temple town standing on the banks of the mighty Tungabhadra river, history and mythology come to life in Hampi, Karnataka. A queen's bath, a spectacular Lotus Palace, a royal stable or a temple, which is said to have been the place where the wedding of Lord Shiva and Goddess Parvati took place, this UNESCO World Heritage site reveals a facet of history at every turn.\n" +
                            "\n" +
                            "Albeit in ruins, the magnificent structures here stand in testimony to Hampi's rich past under the powerful Vijayanagara empire (1336 – 1646 AD). Hampi finds mention in the Hindu epic Ramayana as well. It is said to be the location of the monkey kingdom, Kishkindha. No wonder then that Hampi has ranked second in the must-visit destination list for the year 2019 by the New York Times! The grandiose site of Hampi was the last capital of the Vijayanagara kingdom, one of the most significant in southern India. Its rich kings built exquisite temples and palaces, which won the admiration of travellers between the 14th and 16th centuries. Though plundered later, Hampi still retains more than 1,600 monuments, including palaces, forts, memorial structures, temples, shrines, pillared halls, baths and gateways. The architectural ruins are set against a surreal landscape dotted with heaps of giant boulders perched precariously over kilometres of undulating terrain, attracting rock-climbers, trekkers and other adventure sport enthusiasts. The rusty hues of these rocks are offset by jade-green palm groves, banana plantations and paddy fields. Today, this laid-back city is a tourists' hub, flocked by devotees, adventure-lovers and thrill-seekers.",
                    R.drawable.hampi_virupaksha_temple
                ),
                Place(
                    3,
                    "Gangtok",
                    "Mt Kanchenjunga vantage point",
                    "Perched on steeply-tiered hills in the eastern Himalayas, the picturesque city of Gangtok, the capital of Sikkim, is set against the backdrop of the majestic Mt Kanchenjunga (Khangchendzonga). A tourist hotspot, it invites adventure seekers for its well-laid trekking trails and avenues for mountain biking, hiking, paragliding and river rafting. The city allows you to let loose your inner daredevil and explore the mighty Himalayas like never before.\n" +
                            "\n" +
                            "One of the most frequented hill stations of Sikkim, Gangtok is also a popular Buddhist pilgrimage site and the largest city in the state. It rose to prominence after the Enchey Monastery was established in 1840. In 1894, the ruling Sikkimese Chogyal declared Gangtok the capital of the region. It grew to be a major stopover on the trade route between Lhasa in Tibet by the early 20th century.Apart from being a centre for Tibetan Buddhism, Gangtok is a go-to destination for mountain and wildlife lovers. Magnificent views of various monasteries, Mt Kanchenjunga, Siniolchu, Chumbi Valley and the Chinese border will leave you spellbound. Uniqueness, vibrancy, colours, clouds and warm people all come together to make Gangtok irresistible.The city is also a prime destination for shopping-lovers. The government-run handicraft centre offers unique artefacts, while local hangouts like MG Marg are go-to spots for delicious Sikkimese food and artistic handicrafts. The Gangtok Food and Culture Festival held in December every year draws tourists in hordes and is a celebration of the heritage of the city.",
                    R.drawable.m_g__marg__gangtok_01
                ),
                Place(
                    4,
                    "Munnar",
                    "Hills of Paradise",
                    "A lush carpet of rolling green, interrupted by low rises of mountains of the gorgeous Western Ghats, Munnar, in Kerala, is dotted with huge emerald plantations and pristine waterfalls. No matter where you go in Munnar, a mixed scent of tea, coffee and cardamom will follow you everywhere. With a bountiful of natural treasures, Munnar leaves one rapt with its spectacular and awe-inspiring views. Such is the beauty of the myriad shades of green of the landscape that Munnar is often called the Kashmir of South India.\n" +
                            "\n" +
                            "Nestled at the confluence of three gushing rivers- Mudrapuzha, Nallathanbi and Kundala-Munnar literally means three rivers. During the blooming season, every 12 years, the town of Munnar is transmogrified into an artist's canvas, when the beautiful and vibrant Neelakurinji flower carpets the land in hues of purple and blue. It is truly a sight to behold as the town acquires a paradisiacal setting.\n" +
                            "\n" +
                            "Replete with picturesque greenery, valleys and mountains along with a plethora of flora and fauna in its teeming national parks and wildlife sanctuaries, Munnar is an exhilarating and peaceful travel destination. It offers a respite from the chaos of daily life and all its stress with cloudy skies, constantly pleasant weather, delectable cuisine and hillocks and greenery.\n" +
                            "\n" +
                            "Munnar is also home to the highest peak of South India, Anamudi, at a height of 2,695 m. This peak has a number of trails that make it a must-visit for trekkers and backpackers. Given its tourist appeal, the state government has guaranteed that access to this hill town is easy – it is well-connected to Bengaluru, Kochi, Mysore and other larger cities, ensuring an influx of travellers all year round, including the rainy season, when the Munnar is its most vibrant and fragrant self.\n" +
                            "\n" +
                            "The region around Munnar was once the summer retreat of the erstwhile British Government and several maharajas of the Travancore Kingdom. It was once known as the High Range of Travancore.",
                    R.drawable.munnar_hillstation_kerala
                ),
                Place(
                    5,
                    "Shillong",
                    "Scotland of the East",
                    "Colonial-era charm, a landscape of rolling green and pristine mountains come together to bring to life the city of Shillong, the capital of Meghalaya. Its vistas are accentuated by pine trees, streams, waterfalls and lush green parks. With a picturesque location about 1,525 m above sea level, on a plateau surrounded by hills, Shillong makes for a pleasant tourist destination throughout the year. The plateau is bound by Umiam to the north, the Diengiei Hills to the northwest and the hills of the Assam Valley on the northeast.\n" +
                            "\n" +
                            "Shillong is frequently referred to as the 'Scotland of the East' for its similarity to the Scottish highlands in terms of topography and greenery. Along with covers of tall pine conifers and pineapple shrubs, the city also boasts trekking trails and natural parks aplenty. A natural wonder that has given the city a spot on the world map is the living root bridges. Alive and growing and capable of carrying 50 people at a time, they are a unique experience.\n" +
                            "\n" +
                            "Shillong is a city of simple yet unforgettable experiences. From staying in a treehouse to indulging in thrilling activities like trekking, camping, river rafting, rappelling, kayaking, fishing and caving, Shillong carves a niche for itself in the hearts of visitors. Its quaintness and serenity transform into liveliness and spirited festivities at the time of Christmas. With the melodious tunes of Gospel music in the backdrop, the city, laden with snow, resembles a picturesque postcard.\n" +
                            "\n" +
                            "Home to the Khasi, Jaintia and Garo tribes, the city also has a rich tribal legacy that can be explored by strolling down its lanes. Moreover, it is known for its vibrant nightlife and amazing rock music, which is played in almost every lounge and nightclub.\n" +
                            "\n" +
                            "Shillong was the capital of British-created Assam until 1972. Legend has it that it derived its name from a powerful deity, U Shyllong. The deity was said to reside on the Shillong Peak, overlooking the city and guarding it. Given the status of a new civil station for the Khasi and Jaintia Hills by the British in the late 19th century, Shillong remained the summer capital of Eastern Bengal and Assam for several years. Ravaged by an earthquake in 1897 and completely re-built, Shillong became Meghalaya's capital city in 1972.",
                    R.drawable.shillong
                ),
                Place(
                    6,
                    "Wayanad",
                    "Land of spices and serenity",
                    "A coffer of coffee, cardamom and tea plantations, which envelope the land with lush emerald greenery and fill the air with a heady aroma, Wayanad, in Kerala, is one of the most beautiful regions of the state. Perched on the southernmost tip of the Deccan plateau, Wayanad boasts dense forests that are one of the 20 reserves in UNESCO’s World Network of Biosphere Reserves. A bridge to neighbouring states, the hills of Wayanad are connected with Bandipur (Karnataka) and Mudumalai (Tamil Nadu) to form a massive landmass that helps the wildlife of the region to freely move around in their natural surroundings. For the discerning traveller, Wayanad offers ideal picnic spots next to gurgling mountain streams, serene lakes and cascading waterfalls. While adventure-seekers can opt for mountain biking, camping, trekking, speed boating, zorbing and ziplining, wildlife enthusiasts can choose from wildlife safaris, forest trails or treehouses. Wayanad is also home to Edakkal Caves, where one of the oldest signs of human settlement are preserved. Leading tourist destinations of Mysore, Bengaluru, Kannur, Ooty and Coorg are close by.",
                    R.drawable.cq5dam_web_756_756
                ),
                Place(
                    7,
                    "Thrissur",
                    "Cultural Capital of Kerala",
                    "Often referred to as the cultural capital of Kerala, Thrissur is a centre point of energetic festivities. This city hosts its own film festival, the Thrissur International Film Festival, among many other cultural events throughout the year. It invites tourists for its rich culture and heritage as it carries a strong influence of Indian, European and Arab sources from medieval and colonial times.\n" +
                            "\n" +
                            "Thrissur is most popular for a form of body art that is practiced here. It is known as Puli Kali or Kaduvakali and is mostly showcased during the festival of Onam. Another festival to look out for is Thrissur Pooram, when decorated elephants march through the city to the Vadakkunnathan Temple. A visit to the Indian coffee house that was established in 1958 is also worth the while as it is called the cultural hub of the city.\n" +
                            "\n" +
                            "The area of Thrissur played an important part in fostering trade relations of Kerala with other parts of the world. Earlier, the city was called Trichur and it is said that it was founded by Lord Parasurama, the sixth avatar of Lord Vishnu.",
                    R.drawable.kudamatom_at_thrissur_pooram_2013_7618
                ),
                Place(
                    8,
                    "Ooty",
                    "Nestled in Nilgiris",
                    "A quaint hill town, perched against the backdrop of Doddabetta (2,637 m), the highest peak in the Nilgiris, Ootacamund, in Tamil Nadu, is lined with traditional and colonial-style buildings, which make it the perfect fusion of the new and the old. Clear blue skies, lush green hills, deep verdant valleys and pleasant weather culminate to make this gem of the Nilgiris (Blue Mountains) one of the most attractive tourist destinations in South India. Peppered with coffee and tea plantations, forests of eucalyptus, conifers and pines, and a thick cover of shola trees, Ootacamund is the perfect getaway for nature lovers. Such is the renown of its beauty that it is popularly referred to as the 'Queen of Hill Stations' and the 'Switzerland of India'.\n" +
                            "\n" +
                            "\n" +
                            "A popular summer retreat for Britishers, as well as the capital of the Madras residency in British India, Ootacamund or Ooty or Udhagamandalam (as it was earlier called) has been bestowed with many architectural wonders, thanks to its colonial heritage. The most prominent of these is the Raj Bhavan or the Government House, which is a cream-coloured sprawling bungalow, with a stunning ballroom. It was the erstwhile residence of the governor of Madras and draws tourists from around the area.\n" +
                            "The best way to explore this quaint hill town is via the toy train, which runs on one of the steepest tracks in Asia. Going from a height of 1,069 ft to 7,228 ft, it winds through several breathtaking and picturesque spots, letting one drink in the spectacular size of the rocky terrain, ravines and lush green hills. Some of the scenic stops of this toy train include Coonoor, Wellington and Lovedale.\n" +
                            "Ooty is predominantly inhabited by the Toda tribe, who have been calling the area their home since centuries.",
                    R.drawable.ooty_town_winter_morning_from_gem_park_p1040150e
                )
            )
        }