# Fabric-REI-Plugin-Example-Classes
Example classes to use in an REI plugin for fabric

# Other notable things
• For this you will have to have a blockentity with a custom recipe
• *You will need to add the main class to the entrypoints like this:*

    "entrypoints": {
      "main": [
        "net.vakror.thommas.Thommas"
      ],
      "client": [
        "net.vakror.thommas.ThommasClientMod"
      ],
      "modmenu": [
        "net.vakror.thommas.config.ConfigMenu"
      ],
      "rei_client": [
        "net.vakror.thommas.compat.rei.ThommasREIPlugin"
      ]
    }
