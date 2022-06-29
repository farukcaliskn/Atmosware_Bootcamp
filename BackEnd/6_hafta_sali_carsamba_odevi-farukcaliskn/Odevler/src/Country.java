
public class Country {
	private String countryCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public class Province {
		private String provinceName;

		public String getProvinceName() {
			return provinceName;
		}

		public void setProvinceName(String provinceName) {
			this.provinceName = provinceName;
		}

		public class District {
			private String districtName;

			public String getDistrictName() {
				return districtName;
			}

			public void setDistrictName(String districtName) {
				this.districtName = districtName;
			}

			public class Neighbourhood {
				private String neighbourhoodName;

				public String getNeighbourhoodName() {
					return neighbourhoodName;
				}

				public void setNeighbourhoodName(String neighbourhoodName) {
					this.neighbourhoodName = neighbourhoodName;
				}
			}
		}
	}

	public static void main(String[] args) {
		Country country = new Country();
		country.setCountryCode("TR");

		Country.Province province = new Country().new Province();
		province.setProvinceName("Sivas");

		Country.Province.District district = new Country().new Province().new District();
		district.setDistrictName("Merkez");

		Country.Province.District.Neighbourhood neighbourhood = new Country().new Province().new District().new Neighbourhood();
		neighbourhood.setNeighbourhoodName("Kaleardı");
		System.out.println("Ülke Kodu : " + country.getCountryCode());
		System.out.println("İl        : " + province.getProvinceName());
		System.out.println("İlçe      : " + district.getDistrictName());
		System.out.println("Mahalle   : " + neighbourhood.getNeighbourhoodName());
	}
}
