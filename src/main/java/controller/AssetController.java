import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {
    @Autowired
    private AssetService assetService;

    @PostMapping("/assets")
    public ResponseEntity<AssetResponse> registerAsset(@RequestBody AssetRequest assetRequest) {
        AssetResponse response = assetService.registerAsset(assetRequest);
        return ResponseEntity.ok(response);
    }
}
