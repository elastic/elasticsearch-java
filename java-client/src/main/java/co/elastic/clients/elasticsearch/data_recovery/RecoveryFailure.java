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

package co.elastic.clients.elasticsearch.data_recovery;

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

// typedef: data_recovery._types.RecoveryFailure

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery._types.RecoveryFailure">API
 *      specification</a>
 */
@JsonpDeserializable
public class RecoveryFailure implements JsonpSerializable {
	private final String source;

	private final String reason;

	@Nullable
	private final String detail;

	// ---------------------------------------------------------------------------------------------

	private RecoveryFailure(Builder builder) {

		this.source = ApiTypeHelper.requireNonNull(builder.source, this, "source");
		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.detail = builder.detail;

	}

	public static RecoveryFailure of(Function<Builder, ObjectBuilder<RecoveryFailure>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the source that could not be recovered.
	 * <p>
	 * API name: {@code source}
	 */
	public final String source() {
		return this.source;
	}

	/**
	 * Required - A stable, machine-readable code for the reason that the source
	 * could not be recovered.
	 * <p>
	 * API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Human-readable detail about the failure, which can be truncated.
	 * <p>
	 * API name: {@code detail}
	 */
	@Nullable
	public final String detail() {
		return this.detail;
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

		generator.writeKey("source");
		generator.write(this.source);

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.detail != null) {
			generator.writeKey("detail");
			generator.write(this.detail);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RecoveryFailure}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RecoveryFailure> {
		private String source;

		private String reason;

		@Nullable
		private String detail;

		public Builder() {
		}
		private Builder(RecoveryFailure instance) {
			this.source = instance.source;
			this.reason = instance.reason;
			this.detail = instance.detail;

		}
		/**
		 * Required - The name of the source that could not be recovered.
		 * <p>
		 * API name: {@code source}
		 */
		public final Builder source(String value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - A stable, machine-readable code for the reason that the source
		 * could not be recovered.
		 * <p>
		 * API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Human-readable detail about the failure, which can be truncated.
		 * <p>
		 * API name: {@code detail}
		 */
		public final Builder detail(@Nullable String value) {
			this.detail = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RecoveryFailure}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RecoveryFailure build() {
			_checkSingleUse();

			return new RecoveryFailure(this);
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
	 * Json deserializer for {@link RecoveryFailure}
	 */
	public static final JsonpDeserializer<RecoveryFailure> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RecoveryFailure::setupRecoveryFailureDeserializer);

	protected static void setupRecoveryFailureDeserializer(ObjectDeserializer<RecoveryFailure.Builder> op) {

		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::detail, JsonpDeserializer.stringDeserializer(), "detail");

	}

}
