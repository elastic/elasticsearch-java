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

package co.elastic.clients.elasticsearch.indices.migrate_reindex;

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

// typedef: indices.migrate_reindex.MigrateReindex

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.migrate_reindex.MigrateReindex">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrateReindex implements JsonpSerializable {
	private final ModeEnum mode;

	private final SourceIndex source;

	// ---------------------------------------------------------------------------------------------

	private MigrateReindex(Builder builder) {

		this.mode = ApiTypeHelper.requireNonNull(builder.mode, this, "mode");
		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");

	}

	public static MigrateReindex of(Function<Builder, ObjectBuilder<MigrateReindex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Reindex mode. Currently only 'upgrade' is supported.
	 * <p>
	 * API name: {@code mode}
	 */
	public final ModeEnum mode() {
		return this.mode;
	}

	/**
	 * Required - The source index or data stream (only data streams are currently
	 * supported).
	 * <p>
	 * API name: {@code source}
	 */
	public final SourceIndex source() {
		return this.source;
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

		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);
		generator.writeKey("source");
		this.source.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateReindex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MigrateReindex> {
		private ModeEnum mode;

		private SourceIndex source;

		public Builder() {
		}
		private Builder(MigrateReindex instance) {
			this.mode = instance.mode;
			this.source = instance.source;

		}
		/**
		 * Required - Reindex mode. Currently only 'upgrade' is supported.
		 * <p>
		 * API name: {@code mode}
		 */
		public final Builder mode(ModeEnum value) {
			this.mode = value;
			return this;
		}

		/**
		 * Required - The source index or data stream (only data streams are currently
		 * supported).
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(SourceIndex value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The source index or data stream (only data streams are currently
		 * supported).
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(Function<SourceIndex.Builder, ObjectBuilder<SourceIndex>> fn) {
			return this.source(fn.apply(new SourceIndex.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateReindex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateReindex build() {
			_checkSingleUse();

			return new MigrateReindex(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MigrateReindex}
	 */
	public static final JsonpDeserializer<MigrateReindex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MigrateReindex::setupMigrateReindexDeserializer);

	protected static void setupMigrateReindexDeserializer(ObjectDeserializer<MigrateReindex.Builder> op) {

		op.add(Builder::mode, ModeEnum._DESERIALIZER, "mode");
		op.add(Builder::source, SourceIndex._DESERIALIZER, "source");

	}

}
