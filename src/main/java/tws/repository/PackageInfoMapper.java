package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.PackageInfo;

@Mapper
public interface PackageInfoMapper {
	List<PackageInfo> selectAll();

	void insert(@Param("packageInfo") PackageInfo packageInfo);
}
