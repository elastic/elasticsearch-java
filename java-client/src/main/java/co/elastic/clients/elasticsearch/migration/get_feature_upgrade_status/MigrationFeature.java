/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.migration.get_feature_upgrade_status;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: migration.get_feature_upgrade_status.MigrationFeature

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#migration.get_feature_upgrade_status.MigrationFeature">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrationFeature implements JsonpSerializable {
	private final String featureName;

	private final String minimumIndexVersion;

	private final MigrationStatus migrationStatus;

	private final List<MigrationFeatureIndexInfo> indices;

	// ---------------------------------------------------------------------------------------------

	private MigrationFeature(Builder builder) {

		this.featureName = ApiTypeHelper.requireNonNull(builder.featureName, this, "featureName");
		this.minimumIndexVersion = ApiTypeHelper.requireNonNull(builder.minimumIndexVersion, this,
				"minimumIndexVersion");
		this.migrationStatus = ApiTypeHelper.requireNonNull(builder.migrationStatus, this, "migrationStatus");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");

	}

	public static MigrationFeature of(Function<Builder, ObjectBuilder<MigrationFeature>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code feature_name}
	 */
	public final String featureName() {
		return this.featureName;
	}

	/**
	 * Required - API name: {@code minimum_index_version}
	 */
	public final String minimumIndexVersion() {
		return this.minimumIndexVersion;
	}

	/**
	 * Required - API name: {@code migration_status}
	 */
	public final MigrationStatus migrationStatus() {
		return this.migrationStatus;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<MigrationFeatureIndexInfo> indices() {
		return this.indices;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("feature_name");
		generator.write(this.featureName);

		generator.writeKey("minimum_index_version");
		generator.write(this.minimumIndexVersion);

		generator.writeKey("migration_status");
		this.migrationStatus.serialize(generator, mapper);
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (MigrationFeatureIndexInfo item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrationFeature}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MigrationFeature> {
		private String featureName;

		private String minimumIndexVersion;

		private MigrationStatus migrationStatus;

		private List<MigrationFeatureIndexInfo> indices;

		/**
		 * Required - API name: {@code feature_name}
		 */
		public final Builder featureName(String value) {
			this.featureName = value;
			return this;
		}

		/**
		 * Required - API name: {@code minimum_index_version}
		 */
		public final Builder minimumIndexVersion(String value) {
			this.minimumIndexVersion = value;
			return this;
		}

		/**
		 * Required - API name: {@code migration_status}
		 */
		public final Builder migrationStatus(MigrationStatus value) {
			this.migrationStatus = value;
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<MigrationFeatureIndexInfo> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(MigrationFeatureIndexInfo value, MigrationFeatureIndexInfo... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(
				Function<MigrationFeatureIndexInfo.Builder, ObjectBuilder<MigrationFeatureIndexInfo>> fn) {
			return indices(fn.apply(new MigrationFeatureIndexInfo.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrationFeature}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrationFeature build() {
			_checkSingleUse();

			return new MigrationFeature(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrationFeature}
	 */
	public static final JsonpDeserializer<MigrationFeature> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MigrationFeature::setupMigrationFeatureDeserializer);

	protected static void setupMigrationFeatureDeserializer(ObjectDeserializer<MigrationFeature.Builder> op) {

		op.add(Builder::featureName, JsonpDeserializer.stringDeserializer(), "feature_name");
		op.add(Builder::minimumIndexVersion, JsonpDeserializer.stringDeserializer(), "minimum_index_version");
		op.add(Builder::migrationStatus, MigrationStatus._DESERIALIZER, "migration_status");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(MigrationFeatureIndexInfo._DESERIALIZER),
				"indices");

	}

}
