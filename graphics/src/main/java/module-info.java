import com.bigcorp.project.data.contract.AddressService;

module com.bigcorp.project.graphics {
	requires data.contract;
	requires data.repository;

	uses AddressService;
}