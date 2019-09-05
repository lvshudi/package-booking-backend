package tws.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.entity.PackageInfo;
import tws.repository.PackageInfoMapper;

@RestController
@RequestMapping("/packInfos")
public class PackageInfoController {

    @Autowired
    private PackageInfoMapper packageInfoMapper;

    @GetMapping("")
    public ResponseEntity<List<PackageInfo>> getAll() {
        return ResponseEntity.ok(packageInfoMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<PackageInfo> insert(@RequestBody PackageInfo packageInfo) {
        packageInfoMapper.insert(packageInfo);
        return ResponseEntity.created(URI.create("/packInfos/" + packageInfo.getPackageId())).body(packageInfo);
    }
}
