enum class UserRole (val accessLevel: Int) {
    ADMIN(3),
    EDITOR(2),
    VIEWER(1);
}
    fun checkAccess(userRole: UserRole, requiredAccessLevel: Int): Boolean {
        return userRole.accessLevel >= requiredAccessLevel
    }
    fun main() {
        val adminUser = UserRole.ADMIN
        val editorUser = UserRole.EDITOR
        val viewerUser = UserRole.VIEWER

        val requiredAccessLevel = 2

        println("Admin has sufficient access: ${checkAccess(adminUser, requiredAccessLevel)}")
        println("Editor has sufficient access: ${checkAccess(editorUser, requiredAccessLevel)}")
        println("Viewer has sufficient access: ${checkAccess(viewerUser, requiredAccessLevel)}")

        println("\nAll Roles:")
        for (userRole in UserRole.values()) {
            println("${userRole.name} - Access Level: ${userRole.accessLevel}")
        }
    }