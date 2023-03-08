package Week5;

import java.util.ArrayList;
import java.util.Arrays;

public class Verpakking {
	private int lengte;
	private int breedte;
	private int hoogte;
	private boolean vloeistof;

	public Verpakking(int lengte, int breedte, int hoogte, boolean vloeistof) {
		this.lengte = lengte;
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.vloeistof = vloeistof;
	}

	public int[] getDimensies() {
		return new int[] { this.lengte, this.breedte, this.hoogte };
	}

	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Verpakking)) {
			return false;
		}

		Verpakking verpakking = (Verpakking) object;

		if(this.vloeistof && verpakking.vloeistof) {
			return this.lengte * this.breedte * this.hoogte == verpakking.lengte * verpakking.breedte * verpakking.hoogte;
		}
		// b
		// return this.getDimensies().equals(verpakking.getDimensies());
		//c
		int[] target = verpakking.getDimensies();
		int[] self = this.getDimensies();
		Arrays.sort(self);
		Arrays.sort(target);
		return Arrays.equals(self, target);
	}
}
