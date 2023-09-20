import com.bigcorp.project.business.services.AddressServiceImpl;
import com.bigcorp.project.data.contract.AddressService;

module business {
	requires data.contract;
	requires data.repository;

	provides AddressService with AddressServiceImpl;
}