import com.bigcorp.project.business.services.AddressServiceImpl;
import com.bigcorp.project.data.contract.AddressService;

module business {
	requires data.repository;
	requires data.contract;

	provides AddressService with AddressServiceImpl;
}