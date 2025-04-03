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

import co.elastic.clients.elasticsearch._types.ErrorCause;
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

// typedef: migration.get_feature_upgrade_status.MigrationFeatureIndexInfo

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#migration.get_feature_upgrade_status.MigrationFeatureIndexInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrationFeatureIndexInfo implements JsonpSerializable {
	private final String index;

	private final String version;

	@Nullable
	private final ErrorCause failureCause;

	// ---------------------------------------------------------------------------------------------

	private MigrationFeatureIndexInfo(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.version = ApiTypeHelper.requireNonNull(builder.version, this, "version");
		this.failureCause = builder.failureCause;

	}

	public static MigrationFeatureIndexInfo of(Function<Builder, ObjectBuilder<MigrationFeatureIndexInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - API name: {@code version}
	 */
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code failure_cause}
	 */
	@Nullable
	public final ErrorCause failureCause() {
		return this.failureCause;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("version");
		generator.write(this.version);

		if (this.failureCause != null) {
			generator.writeKey("failure_cause");
			this.failureCause.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrationFeatureIndexInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MigrationFeatureIndexInfo> {
		private String index;

		private String version;

		@Nullable
		private ErrorCause failureCause;

		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - API name: {@code version}
		 */
		public final Builder version(String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code failure_cause}
		 */
		public final Builder failureCause(@Nullable ErrorCause value) {
			this.failureCause = value;
			return this;
		}

		/**
		 * API name: {@code failure_cause}
		 */
		public final Builder failureCause(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.failureCause(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrationFeatureIndexInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrationFeatureIndexInfo build() {
			_checkSingleUse();

			return new MigrationFeatureIndexInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrationFeatureIndexInfo}
	 */
	public static final JsonpDeserializer<MigrationFeatureIndexInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MigrationFeatureIndexInfo::setupMigrationFeatureIndexInfoDeserializer);

	protected static void setupMigrationFeatureIndexInfoDeserializer(
			ObjectDeserializer<MigrationFeatureIndexInfo.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::failureCause, ErrorCause._DESERIALIZER, "failure_cause");

	}

}
