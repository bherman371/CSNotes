import java.text.DecimalFormat;

public class MilkyWayGalaxy {
	
	public static void main(String[] args) {
		DecimalFormat fmt = new DecimalFormat("0");
		
		CelestialObject celestialObject = new CelestialObject();
		Star star = new Star();
		BlackHole blackHole = new BlackHole();
		Planet planet = new Planet();
		Moon moon = new Moon();
		
		System.out.println("Milky Way Galaxy");
		System.out.println("-----------------");
		
		// Stars
		star.setName("Sun");
		String star1Name = star.getName();
		
		star.setName("SSS111");
		String star2Name = star.getName();
		
		star.setName("SSS112");
		String star3Name = star.getName();
		
		// Black Holes
		blackHole.setName("Saggitarius A*");
		String blackHole1Name = blackHole.getName();
		
		blackHole.setName("BBB111");
		String blackHole2Name = blackHole.getName();
		
		blackHole.setName("BBB112");
		String blackHole3Name = blackHole.getName();
 		
		// Planets
		planet.setName("Mercury");
		String planet1Name = planet.getName();
		
		planet.setName("Venus");
		String planet2Name = planet.getName();
		
		planet.setName("Earth");
		String planet3Name = planet.getName();
		
		planet.setName("Mars");
		String planet4Name = planet.getName();
		
		planet.setName("Ceres");
		String planet5Name = planet.getName();
		
		planet.setName("Jupiter");
		String planet6Name = planet.getName();
		
		planet.setName("Saturn");
		String planet7Name = planet.getName();
		
		planet.setName("Uranus");
		String planet8Name = planet.getName();
		
		planet.setName("Neptune");
		String planet9Name = planet.getName();
		
		planet.setName("Pluto");
		String planet10Name = planet.getName();
		
		planet.setName("Eris");
		String planet11Name = planet.getName();
		
		planet.setName("PPP111");
		String planet12Name = planet.getName();
		
		planet.setName("PPP112");
		String planet13Name = planet.getName();
		
		planet.setName("PPP113");
		String planet14Name = planet.getName();
		
		planet.setName("PPP114");
		String planet15Name = planet.getName();
		
		// Moons
		moon.setName("Moon");
		String moon1Name = moon.getName();
		
		// List the stars and planets
		System.out.println("List of stars: " + star1Name + " | " + star2Name + " | " + star3Name);
		System.out.println("List of black holes: " + blackHole1Name + " | " + blackHole2Name + " | " + blackHole3Name);
		System.out.println("List of planets: " + planet1Name + " | " + planet2Name + " | " + planet3Name + " | "
				+ planet4Name + " | " + planet5Name + " | " + planet6Name + " | " + planet7Name + " | " + planet8Name
				+ " | " + planet9Name + " | " + planet10Name + " | " + planet11Name + " | " + planet12Name
				+ " | " + planet13Name + " | " + planet14Name + " | " + planet15Name);
		System.out.println("List of moons: " + moon1Name);
		System.out.println("-----------------");
		
		// Sun Properties
		star.setStarType("Yellow Star");
		star.setSize("Stellar Mass");
		star.setMass(199);
		star.setVolume(140);
		star.setNumPlanets(8);
		
		String star1Type = star.getStarType();
		String star1Size = star.getSize();
		double star1Mass = star.getMass();
		double star1Volume = star.getVolume();
		double star1Density = star.computeDensity();
		int star1NumPlanets = star.getNumPlanets();
		double star1SpinSpeed = star.computeSpinSpeed();
		boolean star1BlackHole = star.willBeBlackHole();
		
		// Print Sun
		System.out.println(star1Name);
		System.out.println(" - Type: " + star1Type);
		System.out.println(" - Size: " + star1Size);
		System.out.println(" - Mass: " + star1Mass + " kg");
		System.out.println(" - Volume: " + star1Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(star1Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Planets: " + star1NumPlanets + " Planets");
		System.out.println(" - Spin Speed: " + fmt.format(star1SpinSpeed) + ".0 km/h");
		System.out.println(" - Will Be A Black Hole: " + star1BlackHole);
		System.out.println("-----------------");
		
		// SSS111 Properties
		star.setStarType("Yellow Star");
		star.setSize("Intermediate Mass");
		star.setMass(321);
		star.setVolume(161);
		star.setNumPlanets(3);
		star.setVelocity(970796);
		
		String star2Type = star.getStarType();
		String star2Size = star.getSize();
		double star2Mass = star.getMass();
		double star2Volume = star.getVolume();
		double star2Density = star.computeDensity();
		int star2NumPlanets = star.getNumPlanets();
		double star2SpinSpeed = star.computeSpinSpeed();
		boolean star2BlackHole = star.willBeBlackHole();
		
		// Print SSS111
		System.out.println(star2Name);
		System.out.println(" - Type: " + star2Type);
		System.out.println(" - Size: " + star2Size);
		System.out.println(" - Mass: " + star2Mass + " kg");
		System.out.println(" - Volume: " + star2Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(star2Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Planets: " + star2NumPlanets + " Planets");
		System.out.println(" - Spin Speed: " + fmt.format(star2SpinSpeed) + ".0 km/h");
		System.out.println(" - Will Be A Black Hole: " + star2BlackHole);
		System.out.println("-----------------");
		
		// SSS112 Properties
		star.setStarType("Yellow Star");
		star.setSize("Intermediate Mass");
		star.setMass(795);
		star.setVolume(340);
		star.setNumPlanets(1);
		star.setVelocity(1362025);
		
		String star3Type = star.getStarType();
		String star3Size = star.getSize();
		double star3Mass = star.getMass();
		double star3Volume = star.getVolume();
		double star3Density = star.computeDensity();
		int star3NumPlanets = star.getNumPlanets();
		double star3SpinSpeed = star.computeSpinSpeed();
		boolean star3BlackHole = star.willBeBlackHole();
		
		// Print SSS112
		System.out.println(star3Name);
		System.out.println(" - Type: " + star3Type);
		System.out.println(" - Size: " + star3Size);
		System.out.println(" - Mass: " + star3Mass + " kg");
		System.out.println(" - Volume: " + star3Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(star3Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Planets: " + star3NumPlanets + " Planet");
		System.out.println(" - Spin Speed: " + fmt.format(star3SpinSpeed) + ".0 km/h");
		System.out.println(" - Will Be A Black Hole: " + star3BlackHole);
		System.out.println("-----------------");
		
		// Saggitarius A* Properties
		blackHole.setSize("Supermassive");
		blackHole.setMass(517400000);
		blackHole.setVelocity(164);
		
		// Mercury Properties
		planet.setPlanetType("Terrestrial");
		planet.setSize("Mercurian");
		planet.setMass(328500);
		planet.setVolume(60830);
		planet.setNumMoons(0);
		planet.setVelocity(172800);
		
		String planet1Type = planet.getPlanetType();
		String planet1Size = planet.getSize();
		double planet1Mass = planet.getMass();
		double planet1Volume = planet.getVolume();
		double planet1Density = planet.computeDensity();
		int planet1NumMoons = planet.getNumMoons();
		double planet1SpinSpeed = planet.computeSpinSpeed();
		boolean planet1DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Mercury
		System.out.println(planet1Name);
		System.out.println(" - Type: " + planet1Type);
		System.out.println(" - Size: " + planet1Size);
		System.out.println(" - Mass: " + planet1Mass + " kg");
		System.out.println(" - Volume: " + planet1Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet1Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Moons: " + planet1NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet1SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet1DwarfPlanet);
		System.out.println("-----------------");
		
		// Venus Properties
		planet.setPlanetType("Terrestrial");
		planet.setSize("Terran");
		planet.setMass(4867000);
		planet.setVolume(938000);
		planet.setNumMoons(0);
		planet.setVelocity(125528);
		
		String planet2Type = planet.getPlanetType();
		String planet2Size = planet.getSize();
		double planet2Mass = planet.getMass();
		double planet2Volume = planet.getVolume();
		double planet2Density = planet.computeDensity();
		int planet2NumMoons = planet.getNumMoons();
		double planet2SpinSpeed = planet.computeSpinSpeed();
		boolean planet2DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Venus
		System.out.println(planet2Name);
		System.out.println(" - Type: " + planet2Type);
		System.out.println(" - Size: " + planet2Size);
		System.out.println(" - Mass: " + planet2Mass + " kg");
		System.out.println(" - Volume: " + planet2Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet2Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Moons: " + planet2NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet2SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet2DwarfPlanet);
		System.out.println("-----------------");
		
		// Earth Properties
		planet.setPlanetType("Terrestrial");
		planet.setSize("Terran");
		planet.setMass(5972000);
		planet.setVolume(1080000);
		planet.setNumMoons(1);
		planet.setVelocity(107208);
		
		String planet3Type = planet.getPlanetType();
		String planet3Size = planet.getSize();
		double planet3Mass = planet.getMass();
		double planet3Volume = planet.getVolume();
		double planet3Density = planet.computeDensity();
		int planet3NumMoons = planet.getNumMoons();
		double planet3SpinSpeed = planet.computeSpinSpeed();
		boolean planet3DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Earth
		System.out.println(planet3Name);
		System.out.println(" - Type: " + planet3Type);
		System.out.println(" - Size: " + planet3Size);
		System.out.println(" - Mass: " + planet3Mass + " kg");
		System.out.println(" - Volume: " + planet3Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet3Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Moons: " + planet3NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet3SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet3DwarfPlanet);
		System.out.println("-----------------");
		
		// Mars Properties
		planet.setPlanetType("Terrestrial");
		planet.setSize("Subterran");
		planet.setMass(639000);
		planet.setVolume(160000);
		planet.setNumMoons(2);
		planet.setVelocity(86399);
		
		String planet4Type = planet.getPlanetType();
		String planet4Size = planet.getSize();
		double planet4Mass = planet.getMass();
		double planet4Volume = planet.getVolume();
		double planet4Density = planet.computeDensity();
		int planet4NumMoons = planet.getNumMoons();
		double planet4SpinSpeed = planet.computeSpinSpeed();
		boolean planet4DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Mars
		System.out.println(planet4Name);
		System.out.println(" - Type: " + planet4Type);
		System.out.println(" - Size: " + planet4Size);
		System.out.println(" - Mass: " + planet4Mass + " kg");
		System.out.println(" - Volume: " + planet4Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet4Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Moons: " + planet4NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet4SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet4DwarfPlanet);
		System.out.println("-----------------");
		
		// Ceres Properties
		planet.setPlanetType("Rocky");
		planet.setSize("Asteroidan");
		planet.setMass(896);
		planet.setVolume(434);
		planet.setNumMoons(0);
		planet.setVelocity(64457);
		
		String planet5Type = planet.getPlanetType();
		String planet5Size = planet.getSize();
		double planet5Mass = planet.getMass();
		double planet5Volume = planet.getVolume();
		double planet5Density = planet.computeDensity();
		int planet5NumMoons = planet.getNumMoons();
		double planet5SpinSpeed = planet.computeSpinSpeed();
		boolean planet5DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Ceres
		System.out.println(planet5Name);
		System.out.println(" - Type: " + planet5Type);
		System.out.println(" - Size: " + planet5Size);
		System.out.println(" - Mass: " + planet5Mass + " kg");
		System.out.println(" - Volume: " + planet5Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet5Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Planets: " + planet5NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet5SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet5DwarfPlanet);
		System.out.println("-----------------");
		
		// Jupiter Properties
		planet.setPlanetType("Gas Giant");
		planet.setSize("Jovian");
		planet.setMass(1898000000);
		planet.setVolume(1430000000);
		planet.setNumMoons(79);
		planet.setVelocity(47158);
		
		String planet6Type = planet.getPlanetType();
		String planet6Size = planet.getSize();
		double planet6Mass = planet.getMass();
		double planet6Volume = planet.getVolume();
		double planet6Density = planet.computeDensity();
		int planet6NumMoons = planet.getNumMoons();
		double planet6SpinSpeed = planet.computeSpinSpeed();
		boolean planet6DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Jupiter
		System.out.println(planet6Name);
		System.out.println(" - Type: " + planet6Type);
		System.out.println(" - Size: " + planet6Size);
		System.out.println(" - Mass: " + planet6Mass + " kg");
		System.out.println(" - Volume: " + planet6Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet6Density) + ".0 kg/m^3");
		System.out.println(" - Number of Orbiting Planets: " + planet6NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet6SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet6DwarfPlanet);
		System.out.println("-----------------");
		
		// Saturn Properties
		planet.setPlanetType("Gas Giant");
		planet.setSize("Neptunian");
		planet.setMass(568300000);
		planet.setVolume(827000000);
		planet.setNumMoons(62);
		planet.setVelocity(34847);
		
		String planet7Type = planet.getPlanetType();
		String planet7Size = planet.getSize();
		double planet7Mass = planet.getMass();
		double planet7Volume = planet.getVolume();
		double planet7Density = planet.computeDensity();
		int planet7NumMoons = planet.getNumMoons();
		double planet7SpinSpeed = planet.computeSpinSpeed();
		boolean planet7DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Saturn
		System.out.println(planet7Name);
		System.out.println(" - Type: " + planet7Type);
		System.out.println(" - Size: " + planet7Size);
		System.out.println(" - Mass: " + planet7Mass + " kg");
		System.out.println(" - Volume: " + planet7Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet7Density) + ".0 kg/m^3");
		System.out.println(" - Number of Moons: " + planet7NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet7SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet7DwarfPlanet);
		System.out.println("-----------------");
		
		// Uranus Properties
		planet.setPlanetType("Ice Giant");
		planet.setSize("Superterran");
		planet.setMass(86810000);
		planet.setVolume(68330000);
		planet.setNumMoons(27);
		planet.setVelocity(24479);
		
		String planet8Type = planet.getPlanetType();
		String planet8Size = planet.getSize();
		double planet8Mass = planet.getMass();
		double planet8Volume = planet.getVolume();
		double planet8Density = planet.computeDensity();
		int planet8NumMoons = planet.getNumMoons();
		double planet8SpinSpeed = planet.computeSpinSpeed();
		boolean planet8DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Uranus
		System.out.println(planet8Name);
		System.out.println(" - Type: " + planet8Type);
		System.out.println(" - Size: " + planet8Size);
		System.out.println(" - Mass: " + planet8Mass + " kg");
		System.out.println(" - Volume: " + planet8Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet8Density) + ".0 kg/m^3");
		System.out.println(" - Number of Moons: " + planet8NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet8SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet8DwarfPlanet);
		System.out.println("-----------------");
		
		// Neptune Properties
		planet.setPlanetType("Ice Giant");
		planet.setSize("Neptunian");
		planet.setMass(102400000);
		planet.setVolume(63000000);
		planet.setNumMoons(14);
		planet.setVelocity(19547);
		
		String planet9Type = planet.getPlanetType();
		String planet9Size = planet.getSize();
		double planet9Mass = planet.getMass();
		double planet9Volume = planet.getVolume();
		double planet9Density = planet.computeDensity();
		int planet9NumMoons = planet.getNumMoons();
		double planet9SpinSpeed = planet.computeSpinSpeed();
		boolean planet9DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Neptune
		System.out.println(planet9Name);
		System.out.println(" - Type: " + planet9Type);
		System.out.println(" - Size: " + planet9Size);
		System.out.println(" - Mass: " + planet9Mass + " kg");
		System.out.println(" - Volume: " + planet9Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet9Density) + ".0 kg/m^3");
		System.out.println(" - Number of Moons: " + planet9NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet9SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet9DwarfPlanet);
		System.out.println("-----------------");
		
		// Pluto Properties
		planet.setPlanetType("Ice");
		planet.setSize("Asteroidan");
		planet.setMass(10390);
		planet.setVolume(6400);
		planet.setNumMoons(5);
		planet.setVelocity(17073);
		
		String planet10Type = planet.getPlanetType();
		String planet10Size = planet.getSize();
		double planet10Mass = planet.getMass();
		double planet10Volume = planet.getVolume();
		double planet10Density = planet.computeDensity();
		int planet10NumMoons = planet.getNumMoons();
		double planet10SpinSpeed = planet.computeSpinSpeed();
		boolean planet10DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Pluto
		System.out.println(planet10Name);
		System.out.println(" - Type: " + planet10Type);
		System.out.println(" - Size: " + planet10Size);
		System.out.println(" - Mass: " + planet10Mass + " kg");
		System.out.println(" - Volume: " + planet10Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet10Density) + ".0 kg/m^3");
		System.out.println(" - Number of Moons: " + planet10NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet10SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet10DwarfPlanet);
		System.out.println("-----------------");
		
		// Eris Properties
		planet.setPlanetType("Ice");
		planet.setSize("Asteroidan");
		planet.setMass(16700);
		planet.setVolume(6590);
		planet.setNumMoons(1);
		planet.setVelocity(12361);
		
		String planet11Type = planet.getPlanetType();
		String planet11Size = planet.getSize();
		double planet11Mass = planet.getMass();
		double planet11Volume = planet.getVolume();
		double planet11Density = planet.computeDensity();
		int planet11NumMoons = planet.getNumMoons();
		double planet11SpinSpeed = planet.computeSpinSpeed();
		boolean planet11DwarfPlanet = planet.isDwarfPlanet();
		
		// Print Eris
		System.out.println(planet11Name);
		System.out.println(" - Type: " + planet11Type);
		System.out.println(" - Size: " + planet11Size);
		System.out.println(" - Mass: " + planet11Mass + " kg");
		System.out.println(" - Volume: " + planet11Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet11Density) + " kg/m^3");
		System.out.println(" - Number of Moons: " + planet11NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet11SpinSpeed) + " km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet11DwarfPlanet);
		System.out.println("-----------------");
		
		// PPP111 Properties
		planet.setPlanetType("Rocky");
		planet.setSize("Subterran");
		planet.setMass(802400);
		planet.setVolume(350500);
		planet.setNumMoons(3);
		planet.setVelocity(11521);
		
		String planet12Type = planet.getPlanetType();
		String planet12Size = planet.getSize();
		double planet12Mass = planet.getMass();
		double planet12Volume = planet.getVolume();
		double planet12Density = planet.computeDensity();
		int planet12NumMoons = planet.getNumMoons();
		double planet12SpinSpeed = planet.computeSpinSpeed();
		boolean planet12DwarfPlanet = planet.isDwarfPlanet();
		
		// Print PPP111
		System.out.println(planet12Name);
		System.out.println(" - Type: " + planet12Type);
		System.out.println(" - Size: " + planet12Size);
		System.out.println(" - Mass: " + planet12Mass + " kg");
		System.out.println(" - Volume: " + planet12Volume + " m^3");
		System.out.println(" - Density: " + fmt.format(planet12Density) + ".0 kg/m^3");
		System.out.println(" - Number of Moons: " + planet12NumMoons + " Moons");
		System.out.println(" - Spin Speed: " + fmt.format(planet12SpinSpeed) + ".0 km/h");
		System.out.println(" - Is A Dwarf Planet: " + planet12DwarfPlanet);
		System.out.println("-----------------");
		
		// PPP112 Properties
		
		
		// Print PPP112
	}

}
