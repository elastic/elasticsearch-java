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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.indices.modify_data_stream;

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

// typedef: indices.modify_data_stream.IndexAndDataStreamAction

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.modify_data_stream.IndexAndDataStreamAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexAndDataStreamAction implements ActionVariant, JsonpSerializable {
	private final String dataStream;

	private final String index;

	// ---------------------------------------------------------------------------------------------

	private IndexAndDataStreamAction(Builder builder) {

		this.dataStream = ApiTypeHelper.requireNonNull(builder.dataStream, this, "dataStream");
		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");

	}

	public static IndexAndDataStreamAction of(Function<Builder, ObjectBuilder<IndexAndDataStreamAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Action variant kind.
	 */
	@Override
	public Action.Kind _actionKind() {
		return Action.Kind.RemoveBackingIndex;
	}

	/**
	 * Required - Data stream targeted by the action.
	 * <p>
	 * API name: {@code data_stream}
	 */
	public final String dataStream() {
		return this.dataStream;
	}

	/**
	 * Required - Index for the action.
	 * <p>
	 * API name: {@code index}
	 */
	public final String index() {
		return this.index;
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

		generator.writeKey("data_stream");
		generator.write(this.dataStream);

		generator.writeKey("index");
		generator.write(this.index);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexAndDataStreamAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexAndDataStreamAction> {
		private String dataStream;

		private String index;

		/**
		 * Required - Data stream targeted by the action.
		 * <p>
		 * API name: {@code data_stream}
		 */
		public final Builder dataStream(String value) {
			this.dataStream = value;
			return this;
		}

		/**
		 * Required - Index for the action.
		 * <p>
		 * API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexAndDataStreamAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexAndDataStreamAction build() {
			_checkSingleUse();

			return new IndexAndDataStreamAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexAndDataStreamAction}
	 */
	public static final JsonpDeserializer<IndexAndDataStreamAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexAndDataStreamAction::setupIndexAndDataStreamActionDeserializer);

	protected static void setupIndexAndDataStreamActionDeserializer(
			ObjectDeserializer<IndexAndDataStreamAction.Builder> op) {

		op.add(Builder::dataStream, JsonpDeserializer.stringDeserializer(), "data_stream");
		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");

	}

}
