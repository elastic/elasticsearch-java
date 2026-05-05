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

package co.elastic.clients.elasticsearch.migration;

import co.elastic.clients.elasticsearch.migration.get_feature_upgrade_status.MigrationFeature;
import co.elastic.clients.elasticsearch.migration.get_feature_upgrade_status.MigrationStatus;
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

// typedef: migration.get_feature_upgrade_status.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#migration.get_feature_upgrade_status.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetFeatureUpgradeStatusResponse implements JsonpSerializable {
	private final List<MigrationFeature> features;

	private final MigrationStatus migrationStatus;

	// ---------------------------------------------------------------------------------------------

	private GetFeatureUpgradeStatusResponse(Builder builder) {

		this.features = ApiTypeHelper.unmodifiableRequired(builder.features, this, "features");
		this.migrationStatus = ApiTypeHelper.requireNonNull(builder.migrationStatus, this, "migrationStatus");

	}

	public static GetFeatureUpgradeStatusResponse of(
			Function<Builder, ObjectBuilder<GetFeatureUpgradeStatusResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code features}
	 */
	public final List<MigrationFeature> features() {
		return this.features;
	}

	/**
	 * Required - API name: {@code migration_status}
	 */
	public final MigrationStatus migrationStatus() {
		return this.migrationStatus;
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

		if (ApiTypeHelper.isDefined(this.features)) {
			generator.writeKey("features");
			generator.writeStartArray();
			for (MigrationFeature item0 : this.features) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("migration_status");
		this.migrationStatus.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetFeatureUpgradeStatusResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetFeatureUpgradeStatusResponse> {
		private List<MigrationFeature> features;

		private MigrationStatus migrationStatus;

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>features</code>.
		 */
		public final Builder features(List<MigrationFeature> list) {
			this.features = _listAddAll(this.features, list);
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds one or more values to <code>features</code>.
		 */
		public final Builder features(MigrationFeature value, MigrationFeature... values) {
			this.features = _listAdd(this.features, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds a value to <code>features</code> using a builder lambda.
		 */
		public final Builder features(Function<MigrationFeature.Builder, ObjectBuilder<MigrationFeature>> fn) {
			return features(fn.apply(new MigrationFeature.Builder()).build());
		}

		/**
		 * Required - API name: {@code migration_status}
		 */
		public final Builder migrationStatus(MigrationStatus value) {
			this.migrationStatus = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetFeatureUpgradeStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetFeatureUpgradeStatusResponse build() {
			_checkSingleUse();

			return new GetFeatureUpgradeStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetFeatureUpgradeStatusResponse}
	 */
	public static final JsonpDeserializer<GetFeatureUpgradeStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetFeatureUpgradeStatusResponse::setupGetFeatureUpgradeStatusResponseDeserializer);

	protected static void setupGetFeatureUpgradeStatusResponseDeserializer(
			ObjectDeserializer<GetFeatureUpgradeStatusResponse.Builder> op) {

		op.add(Builder::features, JsonpDeserializer.arrayDeserializer(MigrationFeature._DESERIALIZER), "features");
		op.add(Builder::migrationStatus, MigrationStatus._DESERIALIZER, "migration_status");

	}

}
