#!/bin/bash

# ============================================================
# Script de versioning automatique pour CodeDialer
# Compatible SemVer : MAJOR.MINOR.PATCH
#
# Usage :
#   ./scripts/versioning.sh major
#   ./scripts/versioning.sh minor
#   ./scripts/versioning.sh patch
#
# Le script :
#   - lit version.properties
#   - incrémente la version
#   - met à jour version.properties
#   - crée un tag Git correspondant
# ============================================================

VERSION_FILE="version.properties"

if [ ! -f "$VERSION_FILE" ]; then
  echo "version=1.0.0" > $VERSION_FILE
fi

VERSION=$(grep "version" $VERSION_FILE | cut -d'=' -f2)

IFS='.' read -r MAJOR MINOR PATCH <<< "$VERSION"

case "$1" in
  major)
    MAJOR=$((MAJOR + 1))
    MINOR=0
    PATCH=0
    ;;
  minor)
    MINOR=$((MINOR + 1))
    PATCH=0
    ;;
  patch)
    PATCH=$((PATCH + 1))
    ;;
  *)
    echo "Usage: $0 {major|minor|patch}"
    exit 1
    ;;
esac

NEW_VERSION="$MAJOR.$MINOR.$PATCH"

echo "version=$NEW_VERSION" > $VERSION_FILE

echo "Nouvelle version : $NEW_VERSION"

git add $VERSION_FILE
git commit -m "chore: bump version to $NEW_VERSION"
git tag "v$NEW_VERSION"

echo "Tag créé : v$NEW_VERSION"
