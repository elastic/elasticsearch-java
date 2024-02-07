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

package co.elastic.clients.elasticsearch.core.health_report;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _global.health_report.SlmIndicator

/**
 * SLM
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.SlmIndicator">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlmIndicator extends BaseIndicator {
	@Nullable
	private final SlmIndicatorDetails details;

	// ---------------------------------------------------------------------------------------------

	private SlmIndicator(Builder builder) {
		super(builder);

		this.details = builder.details;

	}

	public static SlmIndicator of(Function<Builder, ObjectBuilder<SlmIndicator>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code details}
	 */
	@Nullable
	public final SlmIndicatorDetails details() {
		return this.details;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.details != null) {
			generator.writeKey("details");
			this.details.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlmIndicator}.
	 */

	public static class Builder extends BaseIndicator.AbstractBuilder<Builder> implements ObjectBuilder<SlmIndicator> {
		@Nullable
		private SlmIndicatorDetails details;

		/**
		 * API name: {@code details}
		 */
		public final Builder details(@Nullable SlmIndicatorDetails value) {
			this.details = value;
			return this;
		}

		/**
		 * API name: {@code details}
		 */
		public final Builder details(Function<SlmIndicatorDetails.Builder, ObjectBuilder<SlmIndicatorDetails>> fn) {
			return this.details(fn.apply(new SlmIndicatorDetails.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlmIndicator}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlmIndicator build() {
			_checkSingleUse();

			return new SlmIndicator(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlmIndicator}
	 */
	public static final JsonpDeserializer<SlmIndicator> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlmIndicator::setupSlmIndicatorDeserializer);

	protected static void setupSlmIndicatorDeserializer(ObjectDeserializer<SlmIndicator.Builder> op) {
		BaseIndicator.setupBaseIndicatorDeserializer(op);
		op.add(Builder::details, SlmIndicatorDetails._DESERIALIZER, "details");

	}

}
