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

package co.elastic.clients.elasticsearch.ilm;

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

// typedef: ilm._types.ForceMergeAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.ForceMergeAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForceMergeAction implements JsonpSerializable {
	private final int maxNumSegments;

	@Nullable
	private final String indexCodec;

	// ---------------------------------------------------------------------------------------------

	private ForceMergeAction(Builder builder) {

		this.maxNumSegments = ApiTypeHelper.requireNonNull(builder.maxNumSegments, this, "maxNumSegments");
		this.indexCodec = builder.indexCodec;

	}

	public static ForceMergeAction of(Function<Builder, ObjectBuilder<ForceMergeAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max_num_segments}
	 */
	public final int maxNumSegments() {
		return this.maxNumSegments;
	}

	/**
	 * API name: {@code index_codec}
	 */
	@Nullable
	public final String indexCodec() {
		return this.indexCodec;
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

		generator.writeKey("max_num_segments");
		generator.write(this.maxNumSegments);

		if (this.indexCodec != null) {
			generator.writeKey("index_codec");
			generator.write(this.indexCodec);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForceMergeAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ForceMergeAction> {
		private Integer maxNumSegments;

		@Nullable
		private String indexCodec;

		/**
		 * Required - API name: {@code max_num_segments}
		 */
		public final Builder maxNumSegments(int value) {
			this.maxNumSegments = value;
			return this;
		}

		/**
		 * API name: {@code index_codec}
		 */
		public final Builder indexCodec(@Nullable String value) {
			this.indexCodec = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForceMergeAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForceMergeAction build() {
			_checkSingleUse();

			return new ForceMergeAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForceMergeAction}
	 */
	public static final JsonpDeserializer<ForceMergeAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ForceMergeAction::setupForceMergeActionDeserializer);

	protected static void setupForceMergeActionDeserializer(ObjectDeserializer<ForceMergeAction.Builder> op) {

		op.add(Builder::maxNumSegments, JsonpDeserializer.integerDeserializer(), "max_num_segments");
		op.add(Builder::indexCodec, JsonpDeserializer.stringDeserializer(), "index_codec");

	}

}
