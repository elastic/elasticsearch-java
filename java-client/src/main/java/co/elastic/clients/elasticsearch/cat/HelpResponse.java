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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.help.HelpRecord;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.help.Response
@JsonpDeserializable
public class HelpResponse implements JsonpSerializable {
	private final List<HelpRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private HelpResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static HelpResponse of(Function<Builder, ObjectBuilder<HelpResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<HelpRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (HelpRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HelpResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<HelpResponse> {
		private List<HelpRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(List<HelpRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(HelpRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder valueBody(Function<HelpRecord.Builder, ObjectBuilder<HelpRecord>>... fns) {
			this.valueBody = new ArrayList<>(fns.length);
			for (Function<HelpRecord.Builder, ObjectBuilder<HelpRecord>> fn : fns) {
				this.valueBody.add(fn.apply(new HelpRecord.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link HelpResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HelpResponse build() {
			_checkSingleUse();

			return new HelpResponse(this);
		}
	}

	public static final JsonpDeserializer<HelpResponse> _DESERIALIZER = createHelpResponseDeserializer();
	protected static JsonpDeserializer<HelpResponse> createHelpResponseDeserializer() {

		JsonpDeserializer<List<HelpRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(HelpRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
