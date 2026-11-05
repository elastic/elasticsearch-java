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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
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

// typedef: indices._types.AliasesResponseBody

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.AliasesResponseBody">API
 *      specification</a>
 */

public abstract class AliasesResponseBody extends AcknowledgedResponseBase {
	@Nullable
	private final Boolean errors;

	// ---------------------------------------------------------------------------------------------

	protected AliasesResponseBody(AbstractBuilder<?> builder) {
		super(builder);

		this.errors = builder.errors;

	}

	/**
	 * If <code>true</code>, at least one alias action failed. The request still
	 * returns HTTP 200.
	 * <p>
	 * API name: {@code errors}
	 */
	@Nullable
	public final Boolean errors() {
		return this.errors;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.errors != null) {
			generator.writeKey("errors");
			generator.write(this.errors);

		}

	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AcknowledgedResponseBase.AbstractBuilder<BuilderT> {
		@Nullable
		private Boolean errors;

		/**
		 * If <code>true</code>, at least one alias action failed. The request still
		 * returns HTTP 200.
		 * <p>
		 * API name: {@code errors}
		 */
		public final BuilderT errors(@Nullable Boolean value) {
			this.errors = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAliasesResponseBodyDeserializer(
			ObjectDeserializer<BuilderT> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(AbstractBuilder::errors, JsonpDeserializer.booleanDeserializer(), "errors");

	}

}
