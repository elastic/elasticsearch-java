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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Number;
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

// typedef: xpack.usage.EqlFeaturesPipes

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.EqlFeaturesPipes">API
 *      specification</a>
 */
@JsonpDeserializable
public class EqlFeaturesPipes implements JsonpSerializable {
	private final Number pipeTail;

	private final Number pipeHead;

	// ---------------------------------------------------------------------------------------------

	private EqlFeaturesPipes(Builder builder) {

		this.pipeTail = ApiTypeHelper.requireNonNull(builder.pipeTail, this, "pipeTail");
		this.pipeHead = ApiTypeHelper.requireNonNull(builder.pipeHead, this, "pipeHead");

	}

	public static EqlFeaturesPipes of(Function<Builder, ObjectBuilder<EqlFeaturesPipes>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code pipe_tail}
	 */
	public final Number pipeTail() {
		return this.pipeTail;
	}

	/**
	 * Required - API name: {@code pipe_head}
	 */
	public final Number pipeHead() {
		return this.pipeHead;
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

		generator.writeKey("pipe_tail");
		generator.write(this.pipeTail.doubleValue());

		generator.writeKey("pipe_head");
		generator.write(this.pipeHead.doubleValue());

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EqlFeaturesPipes}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EqlFeaturesPipes> {
		private Number pipeTail;

		private Number pipeHead;

		/**
		 * Required - API name: {@code pipe_tail}
		 */
		public final Builder pipeTail(Number value) {
			this.pipeTail = value;
			return this;
		}

		/**
		 * Required - API name: {@code pipe_head}
		 */
		public final Builder pipeHead(Number value) {
			this.pipeHead = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EqlFeaturesPipes}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EqlFeaturesPipes build() {
			_checkSingleUse();

			return new EqlFeaturesPipes(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EqlFeaturesPipes}
	 */
	public static final JsonpDeserializer<EqlFeaturesPipes> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EqlFeaturesPipes::setupEqlFeaturesPipesDeserializer);

	protected static void setupEqlFeaturesPipesDeserializer(ObjectDeserializer<EqlFeaturesPipes.Builder> op) {

		op.add(Builder::pipeTail, JsonpDeserializer.numberDeserializer(), "pipe_tail");
		op.add(Builder::pipeHead, JsonpDeserializer.numberDeserializer(), "pipe_head");

	}

}
