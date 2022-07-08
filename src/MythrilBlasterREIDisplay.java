

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.vakror.thommas.recipe.MythrilBlasterRecipe;
import org.jetbrains.annotations.NotNull;

public class MythrilBlasterREIDisplay extends ThommasRecipeDisplay<MythrilBlasterRecipe> {
	public MythrilBlasterREIDisplay(MythrilBlasterRecipe recipe) {
		super(recipe);
	}

	@Override
	public @NotNull CategoryIdentifier<?> getCategoryIdentifier() {
		return ThommasREICategoryIdentifiers.MYTHRIL_BLASTER;
	}
}
