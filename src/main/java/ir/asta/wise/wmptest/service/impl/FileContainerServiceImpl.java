package ir.asta.wise.wmptest.service.impl;
import java.util.Map;

import ir.asta.wise.core.crud.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.remoting.rs.Include;
import ir.asta.wise.core.remoting.rs.Includes;
import ir.asta.wise.core.util.beancopier.Mapper;
import ir.asta.wise.core.util.beancopier.MapperEnabled;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/*PROTECTED REGION ID(FileContainerServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.FileContainerEntity;
import ir.asta.wise.wmptest.service.FileContainerService;
import ir.asta.wise.wmptest.manager.FileContainerManager;

@Named("fileContainerService")
@MapperEnabled
public class FileContainerServiceImpl
		extends
			AbstractCrudService<FileContainerEntity, java.lang.Long>
		implements
			FileContainerService {

	/*PROTECTED REGION ID(FileContainerServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public FileContainerServiceImpl(FileContainerManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public FileContainerEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "file.*"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public FileContainerEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"file.*"}) FileContainerEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.file.toStr"}, enrich = false)
	public DataPage<FileContainerEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(FileContainerServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
