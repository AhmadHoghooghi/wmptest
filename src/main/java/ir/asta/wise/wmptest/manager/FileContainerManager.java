package ir.asta.wise.wmptest.manager;

import javax.inject.Inject;
import javax.inject.Named;

/*PROTECTED REGION ID(FileContainerManager Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FileContainerEntity;
import ir.asta.wise.wmptest.dao.FileContainerDao;

@Named("fileContainerManager")
public class FileContainerManager
		extends
			ir.asta.wise.core.crud.AbstractCrudManager<FileContainerEntity, java.lang.Long> {

	/*PROTECTED REGION ID(FileContainerManager Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public FileContainerManager(FileContainerDao dao) {
		super.setDao(dao);
	}

	@SuppressWarnings("unused")
	private FileContainerDao getMyDao() {
		return (FileContainerDao) super.getDao();
	}

	/*PROTECTED REGION ID(FileContainerManager Methods) ENABLED START*/

	/*PROTECTED REGION END*/
}
