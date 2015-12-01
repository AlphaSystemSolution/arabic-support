package com.alphasystem.arabic.ui.skin;

import com.alphasystem.arabic.model.ArabicSupport;
import com.alphasystem.arabic.model.ArabicWord;
import com.alphasystem.arabic.ui.ArabicLabelView;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import static javafx.beans.binding.Bindings.when;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import static javafx.scene.paint.Color.*;

/**
 * @author sali
 */
public class ArabicLabelViewSkin extends SkinBase<ArabicLabelView> {

    private final StackPane stackPane;

    public ArabicLabelViewSkin(final ArabicLabelView view) {
        super(view);

        stackPane = new StackPane();
        stackPane.setFocusTraversable(true);

        final Text label = new Text();
        label.setFont(view.getFont());
        label.fontProperty().bind(view.fontProperty());
        label.setOnMouseClicked(event -> makeSelection(view));
        view.labelProperty().addListener((o, oV, nV) -> {
            label.setText(getLabelText(nV));
        });
        label.setText(getLabelText(view.getLabel()));

        final Rectangle background = new Rectangle(view.getLabelWidth(), view.getLabelHeight());
        background.setFill(TRANSPARENT);
        background.setStrokeWidth(1);
        background.setArcWidth(6);
        background.setArcHeight(6);
        background.setOnMouseClicked(event -> makeSelection(view));
        background.widthProperty().bind(view.labelWidthProperty());
        background.heightProperty().bind(view.labelHeightProperty());
        background.strokeProperty().bind(when(view.readonlySelectedProperty()).then(RED).otherwise(BLACK));
        background.strokeWidthProperty().bind(when(view.readonlySelectedProperty()).then(2).otherwise(1));
        stackPane.disableProperty().bind(view.disabledProperty());

        stackPane.getChildren().addAll(background, label);
        stackPane.setMinSize(USE_PREF_SIZE, USE_PREF_SIZE);
        stackPane.setMaxSize(USE_PREF_SIZE, USE_PREF_SIZE);
        stackPane.setPrefSize(view.getLabelWidth(), view.getLabelHeight());
        getChildren().add(stackPane);
    }

    private static String getLabelText(ArabicSupport value) {
        String text = "";
        if (value != null) {
            ArabicWord arabicWord = value.getLabel();
            text = arabicWord == null ? "" : arabicWord.toUnicode();
        }
        return text;
    }

    private void makeSelection(ArabicLabelView view) {
        stackPane.requestFocus();
        view.makeSelection(null);
    }
}