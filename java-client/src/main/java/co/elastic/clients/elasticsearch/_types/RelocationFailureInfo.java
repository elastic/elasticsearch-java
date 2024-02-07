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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: _types.RelocationFailureInfo

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RelocationFailureInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class RelocationFailureInfo implements JsonpSerializable {
	private final int failedAttempts;

	// ---------------------------------------------------------------------------------------------

	private RelocationFailureInfo(Builder builder) {

		this.failedAttempts = ApiTypeHelper.requireNonNull(builder.failedAttempts, this, "failedAttempts");

	}

	public static RelocationFailureInfo of(Function<Builder, ObjectBuilder<RelocationFailureInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code failed_attempts}
	 */
	public final int failedAttempts() {
		return this.failedAttempts;
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

		generator.writeKey("failed_attempts");
		generator.write(this.failedAttempts);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RelocationFailureInfo}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RelocationFailureInfo> {
		private Integer failedAttempts;

		/**
		 * Required - API name: {@code failed_attempts}
		 */
		public final Builder failedAttempts(int value) {
			this.failedAttempts = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RelocationFailureInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RelocationFailureInfo build() {
			_checkSingleUse();

			return new RelocationFailureInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RelocationFailureInfo}
	 */
	public static final JsonpDeserializer<RelocationFailureInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RelocationFailureInfo::setupRelocationFailureInfoDeserializer);

	protected static void setupRelocationFailureInfoDeserializer(ObjectDeserializer<RelocationFailureInfo.Builder> op) {

		op.add(Builder::failedAttempts, JsonpDeserializer.integerDeserializer(), "failed_attempts");

	}

}
