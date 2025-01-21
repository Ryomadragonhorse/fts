package cuc.xh.filetransport.fts;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;

public class HelloController {
    @FXML private ComboBox<String> directionComboBox;
    @FXML private Text localIPText;
    @FXML private Button uploadButton;
    @FXML private ProgressBar progressBar;
    @FXML private Button sendReceiveButton;

    // 初始化方法
    public void initialize() {
        // 设置本机IP
        localIPText.setText(getLocalIP());

        // 默认禁用上传按钮
        uploadButton.setDisable(true);

        // 默认按钮文字为发送
        sendReceiveButton.setText("发送");
    }

    // 处理选择框的变化事件
    @FXML
    private void handleDirectionChange() {
        String selectedRole = directionComboBox.getValue();

        // 根据选择的角色禁用或启用上传按钮
        if ("发送方".equals(selectedRole)) {
            uploadButton.setDisable(false);  // 启用上传按钮
            sendReceiveButton.setText("发送");  // 设置按钮文字为发送
        } else {
            uploadButton.setDisable(true);  // 禁用上传按钮
            sendReceiveButton.setText("接收");  // 设置按钮文字为接收
        }
    }

    // 获取本机IP地址
    private String getLocalIP() {
        return "192.168.0.1";  // 示例IP，可以根据实际情况获取本机IP
    }

    // 处理文件上传按钮点击事件
    @FXML
    private void handleUpload() {
        // 处理文件上传逻辑
        System.out.println("文件上传逻辑...");
    }

    // 处理发送/接收按钮点击事件
    @FXML
    private void handleSendReceive() {
        // 根据选择的角色执行发送或接收操作
        String selectedRole = directionComboBox.getValue();
        if ("发送方".equals(selectedRole)) {
            // 执行发送操作
            System.out.println("发送文件...");
        } else {
            // 执行接收操作
            System.out.println("接收文件...");
        }
    }
}
