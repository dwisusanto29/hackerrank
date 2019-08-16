import java.util.TreeSet;

public class Test7 {

    public static void main(String[] args) {

        long[] a = {722004653, 422841575, 1754347026, 1268413156, 1473882809, 1159578250, 1530954015, 864433040, 1429795835, 446639653, 1456334267, 1839516330, 2068337890, 1717436812, 1339403205, 1950189949, 935504206, 276721350, 551949780, 232859945, 1740272925, 856190207, 1928885286, 1877378581, 1413978977, 737603307, 347450411, 610395285, 257883982, 638516573, 1521720262, 979888635, 1061358147, 1128583639, 100818142, 387757307, 140678240, 1631772156, 1252190346, 1570474075, 2078411808, 561040965, 1262506756, 1999266049, 130994128, 454426313, 1801972350, 1066498334, 731147662, 206438481, 1299358278, 323936939, 1062628687, 1080759915, 53831871, 329124015, 1818363221, 401282281, 939519299, 2076247203, 1039798854, 313755912, 908652189, 2101157000, 1442339550, 1009470330, 341430659, 1583017789, 493758837, 1593621004, 1006008215, 424686996, 7178320, 121031323, 276469396, 138172448, 575457635, 2078441745, 1204670781, 1306605296, 137396577, 356545410, 1630542234, 1200025263, 1437305324, 1684374105, 1529149277, 1108184897, 2085656385, 321184927, 1036948451, 977971590, 634940838, 1945600639, 931644942, 2077280387, 807587320, 1273075600, 1512814528, 1301346156, 719212955, 371339094, 1726033151, 726391275, 492370416, 2002502546, 864563722, 1067828050, 1933460643, 2069234502, 226949698, 2070857219, 278296263, 1857491931, 1123398834, 1715601586, 1394382387, 505064462, 676302834, 1332555124, 826249389, 1713251284, 163043065, 1461190226, 1511368274, 1094688006, 1390986965, 171471945, 220279957, 756317844, 1472818100, 939492912, 1127656937, 1051367602, 1665884186, 1620027353, 906386500, 382964259, 540371754, 692363494, 304715112, 767321451, 615737064, 583011374, 477329734, 1739135897, 151129311, 1871712120, 96716711, 827432145, 1056783595, 922966099, 393199780, 1219826660, 236672676, 1904568054, 167031017, 1627659640, 2076039998, 387310974, 236493835, 1401374450, 1326803885, 1364150772, 305258403, 845204422, 836694476, 1211644902, 1228168680, 1377066229, 1904008395, 1532883791, 2144387680, 372261811, 2115895164, 474233765, 2111397707, 119540826, 198462236, 60630769, 946972970, 1255245831, 983596867, 1340172750, 327588842, 1220269543, 1097257155, 494619858, 700445534, 1025813504, 881930831, 936939369, 279704305, 61251067, 153606492, 584962708, 906455488, 990300967, 1796607609, 2134624167, 219883547, 1553132356, 1520024309, 216787578, 1925394166, 1488435824, 691021342, 1889308224, 1607976650, 889483578, 1949938993, 407465971, 2144729408, 786052211, 1747638720, 324834601, 2006321753, 697412226, 819454458, 559283639, 1723225730, 1701385289, 1496223007, 2002930034, 1762636355, 1649829498, 440409093, 521608195, 492646816, 89533054, 508748713, 712530362, 1642665409, 2028773022, 929317940, 1420575926, 1369725197, 1620339281, 1162400501, 830218198, 362339210, 964855845, 1237684169, 359584969, 1750908056, 837839240, 684419569, 1609746160, 1535251466, 1503874027, 21546150, 1110993547, 1057775667, 1517769156, 966439932, 672928373, 1020115005, 1406849025, 1194536567, 1512761820, 1496382078, 1703285280, 77808534, 991563838, 1584574653, 1007126473, 264656115, 806816201, 479982105, 1427056615, 1637034399, 842321315, 244428812, 727234919, 1201906283, 1995336867, 1565074158, 1886325852, 1457599378, 952841975, 1242716230, 1479145528, 2063835521, 153008248, 849431035, 882791805, 825936620, 1869546040, 142157181, 2020473187, 1234824211, 1638539258, 1576274818, 1312632744, 482619447, 1013365822, 172275568, 747275561, 1820182022, 652257673, 26848527, 1309732772, 1494578987, 271277338, 2036967690, 549001621, 119130556, 1454558200, 287843824, 1576729934, 259916526, 1530560053, 908391813, 176268399, 1683568300, 1757822847, 1059060203, 362021272, 1479885238, 1201217383, 235010810, 567225801, 692272992, 1811285627, 1879858544, 1174892438, 677167800, 2052134112, 1922167998, 349866173, 556908136, 1949016524, 1659598945, 2051487122, 72810214, 1549082986, 453005094, 191940769, 856157537, 740848918, 1768670702, 1116074063, 123925322, 529578866, 1292342461, 1807493622, 139918065, 203919015, 22031245, 1619803302, 1405136397, 257042054, 39545454, 2097409388, 2068327680, 1919403998, 1124818177, 598011831, 1824054461, 899502526, 947878003, 233478948, 701035401, 459993299, 137482421, 773845614, 2009076285, 590487514, 965786383, 717750173, 1331336431, 586973436, 1833824235, 1455261753, 1116552302, 978683047, 1115271726, 1256470366, 1182602061, 1137302970, 728790019, 440254809, 1394345023, 768335473, 390180548, 1315189054, 540255822, 1514998724, 1913200884, 216826634, 267017601, 713595238, 450305581, 968053002, 1173588537, 587788001, 1741898615, 1035181173, 1178275514, 560201349, 1752931345, 362128297, 1147174785, 1439271932, 1817390049, 116243438, 270471330, 785178126, 1372713803, 1453073391, 1922481095, 2101503821, 1893328199, 1169342469, 722355645, 136025099, 337047874, 1262611466, 1651023822, 102765109, 1479438099, 1918041423, 816360346, 1929743679, 738610776, 1989948882, 370048031, 333025742, 877646406, 1548323545, 893227091, 483094103, 1910451841, 2040401875, 1922366034, 1580358241, 9161664, 45353715, 218052718, 1381875466, 1498427105, 2140533812, 1335895638, 1244271656, 1162392632, 2058251283, 1380296754, 1499440505, 1173379100, 883836927, 1602205613, 505333551, 654394701, 271082310, 287593581, 1393005476, 113547544, 657641612, 1726031218, 991193949, 58481508, 471774660, 1474288051, 1968933348, 364692886, 1249170436, 1401807940, 373854549, 1294524151, 1619860657, 1755730014, 645467607, 1612910820, 944142003, 1889739262, 627819803, 854909637, 1122552367, 2127260307, 2028288737, 2006389294, 1581982271, 386138639, 513300346, 1853064580, 673732219, 1906305822, 1966612123, 1331373830, 1484853391, 810322424, 1389855337, 1956628050, 137126826, 1211305036, 173837287, 1386297262, 465629327, 547691835, 533337764, 2085489983, 155938200, 1178805370, 1550917154, 1100080202, 921060984, 31253308, 1954989839, 2043613350, 11029966, 1835794927, 1902518995, 1593012236, 74449917, 268335693, 1298593168, 748182135, 27157866, 1117721642, 2079555965, 1512011256, 1928044065, 1321927653, 1321155657, 2065170891, 385749041, 1494992943, 1303984504, 851378367, 2042684777, 1837322267, 789384702, 51139328, 868643988, 192818207, 1151219529, 1789704971, 224071515, 958725719, 1685834673, 235101480, 647036997, 1440870019, 1828113716, 721486913, 1709205711, 979223235, 1469669048, 1736363576, 2096944876, 1401741364, 1100891183, 1877505293, 576185368, 274563191, 1795192535, 961934408, 1769556133, 951693390, 1813312775, 1664757261, 641532008, 455213828, 1715896588, 1510175995, 648032034, 719632469, 1152397318, 872103548, 1678358187, 690748342, 1107205028, 177911536, 2131618360, 787835095, 899398448, 1693340423, 1767058329, 221583847, 1282220350, 1716519556, 1623325210, 235627885, 1446541200, 52026930, 510191075, 1094250086, 1013961337, 132263560, 2045943475, 679790463, 1797020820, 539991834, 1135004290, 1365433760, 2050167829, 1783036324, 2085066228, 1055081498, 507656223, 1615940766, 1745829839, 1614861250, 1793852301, 1729964550, 255212696, 545767101, 1275821324, 2022271024, 767350947, 410558026, 1591306932, 243192509, 646185910, 890364483, 295219438, 1156376984, 1984614569, 1309180774, 1288640543, 1883074395, 1988971237, 938177715, 275582581, 976491878, 156127826, 178266761, 612044553, 93710405, 1233348258, 1119700776, 1709651170, 831694448, 587078377, 1356019823, 414175349, 842291073, 1901786923, 1689996673, 717078448, 521654221, 2100554698, 160901731, 764846729, 599256959, 1051266214, 1060066166, 1755633942, 888397134, 221763292, 896790837, 623987880, 63250880, 1834968551, 899570460, 1039742757, 1991096376, 1077837220, 1651787310, 2084806780, 163701829, 624004437, 1646974301, 995396276, 1211082813, 855510475, 1409571625, 2053373885, 609813749, 952084649, 622968685, 1131467970, 905155698, 783870415, 1896314698, 1504412656, 1835136628, 808897216, 1112562949, 576050113, 1030660507, 2009353785, 1200037993, 1093911386, 1696838687, 2099608452, 2133654142, 1540451414, 1029962024, 1637957803, 1477774545, 1193663852, 114478591, 977265198, 41576480, 1325561404, 1832775672, 1451148104, 1231451640, 295105773, 255749104, 1854420324, 1426573742, 1160904801, 490807091, 1175404791, 517833808, 178460070, 1984302006, 1630396756, 754510183, 867478864, 1492266893, 1954548175, 1961390249, 1041621931, 1906672978, 1947560743, 434589697, 789151353, 1438034897, 1912364241, 1982815205, 1552513488, 742145790, 2024391684, 730591243, 427437814, 1328056139, 1962042882, 722543586, 1583805242, 1668979558, 1633679, 597226394, 12303000, 1177038469, 1115060201, 190763069, 1013856827, 597973308, 945273251, 1881335690, 2090240200, 752337777, 1695242291, 984378483, 511527107, 1495319385, 1418968179, 1300678459, 785870633, 1183848771, 1136010015, 190900472, 1925994561, 1012918050, 921491714, 205948726, 193490540, 736050948, 928492311, 1777295781, 257546857, 930125989, 227038526, 269849856, 2107164457, 1342098726, 460612924, 973537635, 1940072034, 1405886175, 707389677, 1882828585, 10740303, 255148319, 719723419, 522267409, 1750467703, 2138691597, 1822945868, 388854687, 1175056720, 811472234, 579755159, 953567632, 1824390284, 1501246872, 1159516357, 2017880823, 89814171, 2088008667, 1647692956, 347361027, 870651007, 1874731481, 617210882, 830331815, 1069346559};
        System.out.println("length: " + a.length);
        long m = 911324978;
        long p = maximumSum(a, m);
        System.out.println("answer: " + p);

    }

    // how many subarrays are there if a.length is n???
    // n + (n-1) + (n-2) + 1 = n(n+1)/2 = n^2/2 + n/2
    static long maximumSum(long[] a, long m) {

        long[] pfra = new long[a.length]; // set up prefix array
        pfra[0] = a[0] % m;
        for (int i = 1; i < a.length; i++) pfra[i] = (pfra[i-1] + a[i]) % m;

        TreeSet<Long> ts = new TreeSet<>();
        long maxi = 0;
        for (int i = 0; i < a.length; i++) {
            maxi = Math.max(maxi, pfra[i]);
            Long loo = ts.ceiling(pfra[i] + 1); // ceiling  This method returns the least element in this set greater than or equal to the given element, or null if there is no such element.
            if (loo != null) maxi = Math.max(maxi, (pfra[i] - loo + m) % m);
            ts.add(pfra[i]);
        }
        return maxi;
    }


}



